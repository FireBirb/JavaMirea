package ru.mirea.task13.taskStep4;

public class TestShirt {
    public static void main(String[] args) {
        String[] Sshirts = new String[11];
        Sshirts[0] = "S001,Black Polo Shirt,Black,XL";
        Sshirts[1] = "S002,Black Polo Shirt,Black,L";
        Sshirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        Sshirts[3] = "S004,Blue Polo Shirt,Blue,M";
        Sshirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        Sshirts[5] = "S006,Black T-Shirt,Black,XL";
        Sshirts[6] = "S007,White TShirt,White,XL";
        Sshirts[7] = "S008,White T-Shirt,White,L";
        Sshirts[8] = "S009,Green T-Shirt,Green,S";
        Sshirts[9] = "S010,Orange T-Shirt,Orange,S";
        Sshirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts = new Shirt().fromString(Sshirts);
        for (Shirt shirt : shirts) {
            System.out.println(shirt);
            System.out.println();
        }
    }
}
