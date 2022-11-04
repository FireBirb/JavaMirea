package ru.mirea.task13.taskStep6;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Test {
    public boolean getLine(int I, String... words){
        //System.out.print(I+" - ");
        //System.out.println(Arrays.toString(words));
        //boolean endd=false;
        boolean f=false;
        if (I==0){
            for(int i=0;i<words.length;i++){
                String[] s = words.clone();
                String temp=s[i];
                s[i]=s[0];
                s[0]=temp;
                f=getLine(1,s);
                if(f){
                    return true;
                }
                /* if(f || endd){
                    endd=true;
                }*/
            }
            return false; //endd

        }
        else {
            for (int i=I;i<words.length;i++) {
                if (words[i].toLowerCase().charAt(0)==words[I-1].toLowerCase().charAt(words[I-1].length()-1)) {
                    String[] s = words.clone();
                    String temp=s[i];
                    s[i]=s[I];
                    s[I]=temp;
                    if(I == words.length-1){
                        System.out.println(Arrays.toString(s));
                        return true;
                    }
                    else {
                        f=getLine(I+1,s);
                        if(f){
                            return true;
                        }
                        /*
                        if(f||endd){
                            endd=true;
                        }
                        */
                    }
                }
            }
            return false;//endd
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        //C:\Users\littl\IdeaProjects\Mirea_Java\src\ru\mirea\task13\taskStep6\Words.txt
        Path file = Paths.get(path);
        List<String> lines;
        try {
            lines=Files.readAllLines(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> words = new ArrayList<>();
        for (String line : lines) {
            words.addAll(Arrays.asList(line.split(" ")));
        }
        if (!new Test().getLine(0, words.toArray(new String[0]))) {
            System.out.println("Impossible");
        };
    }
}
