package ru.mirea.task6.taskStep10;

import java.util.Scanner;

public class Processor {
    String brand;
    int cores;
    double frequency; //in GHz

    public void Fill(){
        System.out.println("Enter processor's brand, how many cores it has and its frequency (in GHz), separating them with enter:");
        Scanner scanner = new Scanner(System.in);
        brand = scanner.nextLine();
        cores = scanner.nextInt();
        scanner.nextLine();
        frequency = scanner.nextDouble();
        scanner.nextLine();
    }
    Processor(){}

    Processor(String brand, int cores, double frequency) {
        this.brand = brand;
        this.cores = cores;
        this.frequency = frequency;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getBrand() {
        return brand;
    }
}
