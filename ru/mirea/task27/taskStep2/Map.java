package ru.mirea.task27.taskStep2;

import java.util.HashSet;
import java.util.HashMap;

public class Map {
    private String[] FirstName;
    private String[] LastName;
    private int n;

    public Map()
    {
        FirstName = new String[10];
        LastName = new String[10];
    };

    public void Add(String firstName,String lastName)
    {
        if (n == 10)
        {
            System.out.println("Map is full, no element was added");
        }
        else
        {
            FirstName[n] = firstName;
            LastName[n] = lastName;
            n++;
            System.out.println("The current size is "+n);
        }
    }

    public int getSameFirstNameCount()
    {
        HashMap<String, Integer> firstNamesCount = new HashMap<String, Integer>();
        int answ = 0;
        for(String s : FirstName) firstNamesCount.merge(s, 1, Integer::sum);
        for (int i : firstNamesCount.values()) {
            if (i>1) answ += i;
        }
        return answ;
    }

    public int getSameLastNameCount()
    {

        HashMap<String, Integer> lastNamesCount = new HashMap<String, Integer>();
        int answ = 0;
        for(String s : LastName) lastNamesCount.merge(s, 1, Integer::sum);
        for (int i : lastNamesCount.values()) {
            if (i>1) answ += i;
        }
        return answ;
    }

    public HashMap<String, String> CreateMap()
    {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (int i = 0; i < n; i++)
        {
            hashMap.put(LastName[i],FirstName[i]);
        }
        if (hashMap.size() != 10)
        {
            System.out.println("Not enough pairs or unique keys");
            return null;
        }
        else
        {
            System.out.println("Success");
            return hashMap;
        }
    }
}