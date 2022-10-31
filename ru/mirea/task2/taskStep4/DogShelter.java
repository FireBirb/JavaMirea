package ru.mirea.task2.taskStep4;

import java.util.Arrays;
import java.util.Scanner;

public class DogShelter {
    private Dog[] dogs = new Dog[]{};
    Scanner scanner = new Scanner(System.in);
    public void add() {
        System.out.print("Enter dog's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter dog's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Dog dog = new Dog(name, age); 
        dogs = Arrays.copyOf(dogs, dogs.length + 1);
        dogs[dogs.length - 1] = dog;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogShelter dsh = new DogShelter();
        String ans = "Yes";
        while(ans.equals("Yes")){

            dsh.add();
            System.out.println("Add more dogs? Yes/No");
            ans = scanner.nextLine();
        }
        for (Dog dog : dsh.dogs) {System.out.println(dog);}
    }
}
