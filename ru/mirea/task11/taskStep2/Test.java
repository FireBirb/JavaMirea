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
        String re = "(((0[1-9]|[12][0-9]|3[01])/(0[13578]|1[02]))|((0[1-9]|[12][0-9]|30)/(0[469]|11))|((0[1-9]|1[0-9]|2[0-8])/02))/(19[0-9]{2}|[2-9][0-9]{3})|(29/02/((19|[2-9][0-9])(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00)))";
        Pattern p = Pattern.compile(re);
        Calendar curCal = Calendar.getInstance(), cal = Calendar.getInstance();
        System.out.println("The date in dd/mm/yyyy format");
        String sCal = scanner.nextLine();
        if (!p.matcher(sCal).find()) {
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
