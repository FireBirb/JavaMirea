package ru.mirea.task6.taskStep11;

import ru.mirea.task6.taskStep11.Fahrenheit;
//import ru.mirea.task6.taskStep11.Kelvin;

public class TestConvert {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        Kelvin kelvin = new Kelvin();
        System.out.println(fahrenheit.Convert(-40));
        System.out.println(kelvin.Convert(0));
    }
}
