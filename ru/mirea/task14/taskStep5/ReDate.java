package ru.mirea.task14.taskStep5;

import java.util.regex.Pattern;

public class ReDate {
    public static void main(String[] args) {
        String re = "(((0[1-9]|[12][0-9]|3[01])/(0[13578]|1[02]))|((0[1-9]|[12][0-9]|30)/(0[469]|11))|((0[1-9]|1[0-9]|2[0-8])/02))/(19[0-9]{2}|[2-9][0-9]{3})|(29/02/((19|[2-9][0-9])(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00)))";
        Pattern p = Pattern.compile(re);
        String[] ss = new String[] {"29/02/2000", "30/04/2003", "01/01/2003", "29/02/2001", "30-04-2003", "1/1/1899"};
        for (String s : ss) {
            System.out.println(p.matcher(s).matches());
        }
    }
}
