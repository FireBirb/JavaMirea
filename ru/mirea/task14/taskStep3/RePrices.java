package ru.mirea.task14.taskStep3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RePrices {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+\\.\\d{2} (USD|RUB|EU)");
        String s = "kfwpakofopwa9.90 USDdw180.00 RUBaddawd108 EUjdopwajdowpa181.00ERRkpd[wakd[aw1000.50 EU";
        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
