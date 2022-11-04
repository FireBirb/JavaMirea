package ru.mirea.task14.taskStep8;

import java.util.Arrays;

public class Test {
    public static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }

    public static void main(String[] args) {
        String[] array =
                new String[]{"words", "are", "fun", null, "screw the null tho"};

        String[] newArray =  (String[]) filter(array, new Filter() {
            public boolean apply(Object o) {
                return o != null;
            }
        });
        System.out.println(Arrays.toString(newArray));
    }
}
