package ru.mirea.task11.taskStep4;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month, day, hour, minute;
        System.out.print("Year: ");
        year = scanner.nextInt();
        System.out.print("Month: ");
        month = scanner.nextInt();
        System.out.print("Day: ");
        day = scanner.nextInt();
        System.out.print("Hour: ");
        hour = scanner.nextInt();
        System.out.print("Minute: ");
        minute = scanner.nextInt();
        Calendar cal = new GregorianCalendar(year, month-1, day, hour, minute);
        Date date = new Date(new GregorianCalendar(year, month-1, day, hour, minute).getTimeInMillis());
        System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm", Locale.ENGLISH).format(cal.getTime()));
        System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm", Locale.ENGLISH).format(date.getTime()));
    }
}
