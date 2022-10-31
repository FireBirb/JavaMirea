package ru.mirea.task4.taskStep4;

import static ru.mirea.task4.taskStep4.Brand.*;

public class Computer {
    Processor processor;
    Memory memory;
    Monitor monitor;
    Brand brand;

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
        return "\nBrand: " + this.getBrand()
                + "\nMemory: " + this.getMemory().getType() + " " + this.getMemory().getSize() + "GB"
                + "\nMonitor: " + this.getMonitor().diagonal + "\" " + this.getMonitor().getRes() + " "
                + this.getMonitor().getFrequency() + " Hz"
                + "\nProcessor: " + this.getProcessor().getFrequency() + "GHz " + this.getProcessor().getBrand() + " "
                + this.getProcessor().getCores() + "-Core";
    }
}
