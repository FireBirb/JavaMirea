package ru.mirea.task14.taskStep9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dict {
    void buildDictionaryWithMap(String text){
        text = text.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                map.compute(ch, (character, integer)
                        -> integer == null ? 1 : integer + 1);
            }
        }

        ArrayList<Map.Entry<Character, Integer>> entries =
                new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        new Dict().buildDictionaryWithMap("Aboba is Aboba idk zzzzzzz");
    }
}
