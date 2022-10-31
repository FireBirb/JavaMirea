package ru.mirea.task4.taskStep4;

public class Memory {
    String type;
    int size; //in GB

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
