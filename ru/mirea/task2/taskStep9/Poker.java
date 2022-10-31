package ru.mirea.task2.taskStep9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String>  suits = new HashMap<>();
        suits.put (0, "clubs");
        suits.put (1, "diamonds");
        suits.put (2, "hearts");
        suits.put (3, "spades");
        HashMap<Integer, String>  vals = new HashMap<>();
        vals.put(0, "2"); vals.put(1, "3"); vals.put(2, "4"); vals.put(3, "5");
        vals.put(4, "6"); vals.put(5, "7"); vals.put(6, "8"); vals.put(7, "9");
        vals.put(8, "10"); vals.put(9, "Jack"); vals.put(10, "Queen"); vals.put(11, "King");
        vals.put(12, "Ace");
        ArrayList<String> deck = new ArrayList<>(52);
        //String[] deck = new String[52];
        int c = 0;
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<13; j++) {
                //deck.[c] = vals.get(j) + " of " + suits.get(i);
                deck.add(vals.get(j) + " of " + suits.get(i));
                c++;
            }
        }
        //System.out.println(Arrays.toString(deck));

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //String[] cur_deck = deck;
        System.out.println("Enter number of players");
        int n = scanner.nextInt();
        while (n>6 || n<1) {
            System.out.println("Incorrect number. It must be between 1 and 6");
            n = scanner.nextInt();
        }
        for (int i = 0; i<5*n; i++) {
            int r = random.nextInt(0,51-i);
            System.out.print(deck.get(r));
            deck.remove(r);
            if (((i + 1) % 5) == 0) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
    }
}
