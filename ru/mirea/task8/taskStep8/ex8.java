package ru.mirea.task8.taskStep8;
import java.util.Scanner;
//Палиндром
public class ex8 {
    public static void rec(String s, int cur){
        if(cur>s.length()/2){
            System.out.println("YES");
        }else{
            if(s.charAt(cur)==s.charAt(s.length()-1-cur)){
                rec(s,cur+1);
            }else{
                System.out.println("NO");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("S - ");
        String s = scanner.nextLine();
        rec(s,0);
    }
}
