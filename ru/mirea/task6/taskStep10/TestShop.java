package ru.mirea.task6.taskStep10;

import ru.mirea.task6.taskStep10.Shop;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - add a computer\n2 - delete a computer\n3 - find a computer\n4 - show all\nAnything else - exit");
            String opt = scanner.nextLine();
            switch (opt) {
                case "1" -> shop.add();
                case "2" -> {
                    System.out.print("Enter index: ");
                    try {
                        int i = Integer.parseInt(scanner.nextLine());
                        shop.del(i);
                    } catch (NumberFormatException e) {System.out.println("Not int");}
                }
                case "3" -> {
                    Object[] params = new Object[4];
                    boolean any = false;
                    String answ;
                    do {
                        System.out.println("Search by:\n1)Brand\n2)Memory\n3)Processor\n4)Monitor\nAnything else - exit");
                        String param = scanner.nextLine();
                        switch (param) {
                            case "1":
                                Brand brand = null;
                                do {
                                    System.out.println("Enter brand's name:");
                                    try {
                                        brand = Brand.valueOf(scanner.nextLine());
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("No such brand");
                                    }
                                } while (brand == null);
                                params[0] = brand;
                                any = true;
                                break;
                            case "2":
                                Memory memory = new Memory();
                                memory.Fill();
                                params[1] = memory;
                                any = true;
                                break;
                            case "3":
                                Processor processor = new Processor();
                                processor.Fill();
                                params[2] = processor;
                                any = true;
                                break;
                            case "4":
                                Monitor monitor = new Monitor();
                                monitor.Fill();
                                params[3] = monitor;
                                any = true;
                                break;
                            default:
                                if (!any) System.out.println("Please select at least one parameter"); break;
                        }
                        System.out.println("Add/change parameters? Y/N");
                        answ = scanner.nextLine();
                    } while (!(answ.equals("N")) || !any);
                    shop.find(params);
                }
                case "4" -> {
                    System.out.println(shop);
                }
                //case "" -> {}
                default -> {
                    exit(0);
                }
            }
        }
    }
}
