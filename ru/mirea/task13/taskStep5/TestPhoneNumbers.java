package ru.mirea.task13.taskStep5;

public class TestPhoneNumbers {
    public static void main(String[] args) {
        PhoneNumbers p1 = new PhoneNumbers();
        p1.Normalize("+79175655655");
        System.out.println(p1);
        PhoneNumbers p2 = new PhoneNumbers();
        p2.Normalize("+109175655655");
        System.out.println(p2);
        PhoneNumbers p3 = new PhoneNumbers();
        p3.Normalize("89175655655");
        System.out.println(p3);
        PhoneNumbers p4 = new PhoneNumbers();
        p4.Normalize("75655655");
        System.out.println(p4);
    }
}
