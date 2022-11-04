package ru.mirea.task13.taskStep4;

import java.util.StringTokenizer;

public class Shirt {
    String ID, name, color, size;
    public String toString() {
        return String.format("ID:%s\nName:%s\nColor:%s\nSize:%s", ID, name, color, size).toString();
    }
    Shirt[] fromString(String[] ss) {
        Shirt[] shirts = new Shirt[ss.length];
        for (int i = 0; i<ss.length; i++) {
            shirts[i] = new Shirt();
            shirts[i].fromString(ss[i]);
        }
        return shirts;
    }
    void fromString(String s) {
        StringTokenizer st = new StringTokenizer(s, ",");
        setID(st.nextToken());
        setSize(st.nextToken());
        setName(st.nextToken());
        setColor(st.nextToken());
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
