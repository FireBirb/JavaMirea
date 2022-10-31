package ru.mirea.task41.taskStep2;

import ru.mirea.task41.taskStep2.Phone;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535", "iphone smth smth", 200);
        Phone phone2 = new Phone("89165718395", "xiaomi smth smth", 300);
        Phone phone3 = new Phone("89105738148", "samsung smth smth", 340);
        for (Phone phone : new Phone[]{phone1, phone2, phone3}) {
            System.out.println(phone);
            phone.receiveCall("Alex");
        }
        phone1.receiveCall("Deer<3", "89165137519");
        phone2.sendMessage("88005553535");
        phone2.sendMessage("88005553535", "89104275188");
    }
}
