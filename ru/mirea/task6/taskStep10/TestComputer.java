package ru.mirea.task6.taskStep10;

import static ru.mirea.task6.taskStep10.Brand.*;

public class TestComputer {
    public static void main(String[] args) {
        Processor processor1 = new Processor("Intel", 2, 1.8);
        Processor processor2 = new Processor("AMD Ryzen", 8, 3.2);
        Memory memory1 = new Memory("SSD", 256 );
        Memory memory2 = new Memory("SSD", 512);
        Monitor monitor1 = new Monitor(15.6, 1920, 1080, 100);
        Monitor monitor2 = new Monitor(17, 1920, 1080, 144);
        Computer computer1 = new Computer(Apple, processor1, memory1, monitor1);
        Computer computer2 = new Computer(Asus, processor2, memory2, monitor2);
        Computer computer3 = new Computer(HP, processor1, memory2, monitor1);
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
    }
}
