package ru.mirea.task4.taskStep4;

public class Processor {
    String brand;
    int cores;
    double frequency; //in GHz

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
