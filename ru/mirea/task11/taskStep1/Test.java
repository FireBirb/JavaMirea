package ru.mirea.task11.taskStep1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //String st_date, cur_date;
        //LocalDateTime ldt = LocalDateTime.now();
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        //cur_date = String.format("%d\\%s\\%d %d:%d", ldt.getYear(), ldt.getMonth(), ldt.getDayOfMonth(), ldt.getHour(), ldt.getMinute());
        System.out.println("Pavlova\nI got this task on 2022/09/26 at 13:35\nRight now it's " + dateFormat.format(date));
    }
}
