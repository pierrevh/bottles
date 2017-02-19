package org.pvhees.bottles;

public class Bottles {

    public String song() {
        return verses(99, 0);
    }

    public String verses(int starting, int ending) {
        StringBuilder sb = new StringBuilder();
        for (int i = starting; i >= ending; i--) {
            if (i != starting) {
                sb.append("\n");
            }
            sb.append(verse(i));
        }
        return sb.toString();
    }

    public String verse(int number) {
        BottleNumber bottle_number = new BottleNumber(number);
        BottleNumber next_bottle_number = bottle_number.successor();

        return capitalize(bottle_number.toString()) + " of beer on the wall, " +
                bottle_number + " of beer.\n" +
                bottle_number.action() + ", " +
                next_bottle_number + " of beer on the wall.\n";
    }

    private static String capitalize(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
