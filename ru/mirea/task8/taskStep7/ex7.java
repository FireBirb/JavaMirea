package ru.mirea.task8.taskStep7;
import java.util.Scanner;
//Разложение на простые множители
public class ex7 {
    public static void rec(int n, int cur){
        if(n!=1){
            while(n%cur==0){
                n=n/cur;
                System.out.println(cur);
            }
            if(cur==2){
                cur=1;
            }
            rec(n,cur+2);
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n - ");
        int n = scanner.nextInt();
        rec(n,2);
    }
}
