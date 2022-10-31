package ru.mirea.task7.taskStep5to6;

public class ProcessStrings implements ProcessableStrings {

    @Override
    public int Length(String s) {
        return s.length();
    }

    @Override
    public String Odds(String s) {
        String answ = "";
        for (int i = 1; i<Length(s); i += 2) {
            answ += s.charAt(i);
        }
        return answ;
    }

    @Override
    public String Reverse(String s) {
        String answ = "";
        for (int i=0; i<Length(s); i++)
        {
            char ch= s.charAt(i); //extracts each character
            answ= ch+answ; //adds each character in front of the existing string 
        }
        return answ;
    }

    public static void main(String[] args) {
        String s = "Senator";
        ProcessStrings pr = new ProcessStrings();
        System.out.println(pr.Length(s));
        System.out.println(pr.Odds(s));
        System.out.println(pr.Reverse(s));
    }
}
