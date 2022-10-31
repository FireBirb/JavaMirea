package ru.mirea.task2.taskStep5;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> comps = new ArrayList<>();
    public void add() {
        Computer comp = new Computer();
        comps.add(comp);
    }
    public void del(int i) {
        i--;
        if (!(comps.isEmpty())) {
            if (i < comps.size()) {
                comps.remove(i);
            } else {
                System.out.println("Index out of range");
            }
        } else {
            System.out.println("The shop is empty");
        }
    }
    public void find(String price, String color, String manuf) {
        boolean none = true;
        for (Computer comp : comps) {
            //if all necessary parameters check out
            if ((comp.getPrice().equals(price)||price.equals(""))&&(comp.getColor().equals(color)||color.equals(""))&&(comp.getManufacturer().equals(manuf)||manuf.equals(""))) {
                System.out.println(comp);
                none = false;
            }
        }
        if (none) System.out.println("None found");
    }

    public String toString() {
        StringBuilder answ = new StringBuilder();
        int i = 1;
        for (Computer comps : comps){
            answ.append(i + ") " + comps.toString() + "\n");
            i++;
        }
        return answ.toString().equals("") ? "None found" : answ.toString();
    }
}
