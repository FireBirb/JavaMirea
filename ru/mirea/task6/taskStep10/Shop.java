package ru.mirea.task6.taskStep10;

import java.util.ArrayList;
import ru.mirea.task6.taskStep10.Computer;

public class Shop {
    private ArrayList<Computer> comps = new ArrayList<>();
    public void add() {
        Computer comp = new Computer();
        comp.Fill();
        comps.add(comp);
    }
    public void del(int i) {
        i--;
        if (!(comps.isEmpty())) {
            if (i < comps.size()) {
                comps.remove(i);
            } else {
                System.out.printf("Index out of range (%d/%d)%n", i, comps.size());
                // System.out.println("Index out of range");
            }
        } else {
            System.out.printf("The shop is empty (%d/%d)%n", i, comps.size());
        }
    }
    public void find(Object[] params) {
        boolean none = true;
        for (Computer comp : comps) {
            if ((comp.getBrand()==params[0]||params[0]==null)&&(comp.getMemory()==params[1]||params[1]==null)&&(comp.getProcessor()==params[2]||params[2]==null)&&(comp.getMonitor()==params[3]||params[3]==null)) {
                System.out.println(comp);
                none = false;
            }
        }
        if (none) System.out.println("None found");
    }

    public String toString() {
        StringBuilder answ = new StringBuilder();
        int i = 1;
        for (Computer comp : comps){
            answ.append(i + ") " + comp.toString() + "\n");
            i++;
        }
        return answ.toString().equals("") ? "None found" : answ.toString();
    }
}
