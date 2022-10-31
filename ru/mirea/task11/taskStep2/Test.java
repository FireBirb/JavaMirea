package ru.mirea.task11.taskStep2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.*;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("^((0[1-9])|([1-2][0-9])|(3[0-1]))/((0[1-9])|(1[0-2]))/\\d{4}$");
        Calendar curCal = Calendar.getInstance(), cal = Calendar.getInstance();
        System.out.println("The date in dd/mm/yyyy format");
        String sCal = scanner.nextLine();
        while (!p.matcher(sCal).matches()) {
            System.out.println("Wrong date, try again");
            sCal = scanner.nextLine();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            cal.setTime(sdf.parse(sCal));
        } catch (ParseException e) {
            System.out.print("How and why though....");
            throw new RuntimeException(e);
        }
        cal.set(Calendar.HOUR_OF_DAY,curCal.get(Calendar.HOUR_OF_DAY));
        cal.set(Calendar.MINUTE,curCal.get(Calendar.MINUTE));
        cal.set(Calendar.SECOND,curCal.get(Calendar.SECOND));
        cal.set(Calendar.MILLISECOND,curCal.get(Calendar.MILLISECOND));
        switch (cal.compareTo(curCal)) {
            case -1: System.out.println("The current date is later than the input one"); break;
            case 0: System.out.println("The input date is equal to the current one"); break;
            case 1: System.out.println("The current date is earlier than the input one"); break;
        }
    }
}
