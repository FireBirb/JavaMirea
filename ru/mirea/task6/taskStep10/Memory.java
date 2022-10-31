package ru.mirea.task6.taskStep10;

import java.util.Scanner;

public class Memory implements Fillable {
    String type;
    int size; //in GB

    public void Fill(){
        System.out.println("Enter type of the memory card and its capacity (in GB), separating them with enter:");
        Scanner scanner = new Scanner(System.in);
        type = scanner.nextLine();
        size = scanner.nextInt();
        scanner.nextLine();
    }

    Memory(){}

    Memory (String type, int size) {
        this.type = type;
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
