package ru.mirea.task2.taskStep5;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        boolean tr = true;
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        while (tr) {
            //just an instruction
            System.out.println("1 - add a computer\n2 - delete a computer\n3 - find a computer\n4 - show all\nAnything else - exit");
            int opt = scanner.nextInt();
            switch (opt) {
                case 1 -> shop.add();
                case 2 -> {
                    System.out.print("Enter index: ");
                    int i = scanner.nextInt();
                    shop.del(i);
                }
                case 3 -> {
                    String[] params = {"","",""};
                    int n = 0;
                    boolean any = false;
                    do {
                        any = !(params[0].equals("") && params[1].equals("") && params[2].equals(""));
                        //only suggest unfilled params and only suggest exit when at least one param if filled
                        System.out.println("Find by:" + (any ? "\n0)Exit" : "") +(params[0].equals("") ? "\n1)Price" : "")  + (params[1].equals("") ? "\n2)Color" : "") + (params[2].equals("") ? "\n3)Manufacturer" : ""));
                        n = scanner.nextInt();
                        scanner.nextLine();
                        if (n == 1 && params[0].equals("")) {
                            System.out.println("Enter price");
                            params[0] = scanner.nextLine();
                        }
                        if (n == 2 && params[1].equals("")) {
                            System.out.println("Enter color");
                            params[1] = scanner.nextLine();
                        }
                        if (n == 3 && params[2].equals("")) {
                            System.out.println("Enter manufacturer");
                            params[2] = scanner.nextLine();
                        }
                    } while(n!=0 || !any);
                    shop.find(params[0], params[1], params[2]);
                }
                case 4 -> {System.out.println(shop);}
                default -> {tr = false;}
            }
        }
    }
}
