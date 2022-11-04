package ru.mirea.task13.taskStep3;

public class TestAddress {
    public static void main(String[] args) {
        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();
        Address address4 = new Address();
        Address address5 = new Address();
        Address address6 = new Address();
        address1.split("a, b, c, d, e, f, g");
        System.out.println(address1 + "\n");
        address2.split("Smth, smth, checking, st, h, idk names, wtf");
        System.out.println(address2 + "\n");
        address3.split("Smth, smth, checking, st, h, one less"); //to little args
        //System.out.println(address3 + "\n"); Intentionally empty
        address4.token("a1, b1; c1. d1; e1. f1; g1");
        System.out.println(address4 + "\n");
        address5.token("Country, region; city. street; house. building something something; apartment");
        System.out.println(address5 + "\n");
        address6.token("Country, region; city. street; house. building something something; apartment; one more"); //to many args
        //System.out.println(address6); Intentionally empty
    }
}
