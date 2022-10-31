package ru.mirea.task6.taskStep10;

import java.util.Scanner;

public class Computer implements Fillable {
    Processor processor;
    Memory memory;
    Monitor monitor;
    Brand brand;

    public void Fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the computer's brand:");
        do {
            try {
                this.brand = Brand.valueOf(scanner.nextLine());
            } catch (IllegalArgumentException e) {System.out.println("No such brand");}
        } while (this.brand == null);
        Memory memory1 = new Memory();
        memory1.Fill();
        this.memory = memory1;
        Processor processor1 = new Processor();
        processor1.Fill();
        this.processor = processor1;
        Monitor monitor1 = new Monitor();
        monitor1.Fill();
        this.monitor = monitor1;
    }
    Computer(){}

    Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
        this.processor = processor;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Brand getBrand() {
        return brand;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }
    public String toString(){
        return "Brand: " + this.getBrand()
                + "\nMemory: " + this.getMemory().getType() + " " + this.getMemory().getSize() + "GB"
                + "\nMonitor: " + this.getMonitor().diagonal + "\" " + this.getMonitor().getRes() + " "
                + this.getMonitor().getFrequency() + " Hz"
                + "\nProcessor: " + this.getProcessor().getFrequency() + "GHz " + this.getProcessor().getBrand() + " "
                + this.getProcessor().getCores() + "-Core";
    }
}
