package ru.mirea.task8.taskStep9;
import java.util.Scanner;
//Без двух нулей
public class ex9 {
    public static int rec(int a, int b, boolean preva){
        if(a>0) {
            if(b>0){
                if(preva){
                    return rec(a,b-1,false);
                }else{
                    return rec(a-1,b,true)+rec(a,b-1,false);
                }

            }else{
                if(!preva && a==1){
                    return 1;
                }else{
                    return 0;
                }
            }
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a - ");
        int a = scanner.nextInt();
        System.out.print("b - ");
        int b = scanner.nextInt();
        System.out.println(rec(a,b,false));
    }
}
