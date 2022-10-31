package ru.mirea.task41.taskStep2;

public class Phone {
    String model, number;
    int weight;
    Phone(){};
    Phone (String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }
    Phone (String number, String model) {
        this.number = number;
        this.model = model;
    }
    public void receiveCall(String name){
        System.out.printf("%s calling\n", name);
    }
    public void receiveCall(String name, String number){
        System.out.printf("%s calling\n%s\n", name, number);
    }
    public void sendMessage (String ... nums) {
        for (String num : nums) {System.out.println(num + " ");}
    }
    public String getNumber() {
        return number;
    }
    public int getWeight() {
        return weight;
    }
    public String getModel() {
        return model;
    }
    
    public String toString() {
        return "Model: " + this.getModel() + ", number: " + this.getNumber() + ", weight: " + this.getWeight();
    }
}
