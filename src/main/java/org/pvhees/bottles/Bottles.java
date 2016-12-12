package org.pvhees.bottles;

public class Bottles {

    public String verse(int bottles) {
        Bottle currentBottle = new Bottle(bottles);
        Bottle remainingBottle = new Bottle(bottles - 1);

        String chorus = capitalizeFirst(currentBottle.count()) + " " + currentBottle.container() + " of beer on the wall, "
                + currentBottle.count() + " " + currentBottle.container() + " of beer.\n";

        String takedown = "Take " + currentBottle.subjectOfRemoval() + " down and pass it around, "
                + remainingBottle.count() + " " + remainingBottle.container() + " of beer on the wall.";

        String gotoTheStore = "Go to the store and buy some more, 99 bottles of beer on the wall.";

        return chorus + (bottles > 0 ? takedown : gotoTheStore);
    }

    private static String capitalizeFirst(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public String song() {
        return verses(99, 0);
    }

    public String verses(int bottlesStart, int bottlesEnd) {
        StringBuilder song = new StringBuilder();
        for (int i = bottlesStart; i >= bottlesEnd; i--) {
            song.append(verse(i));
            if (i != bottlesEnd) {
                song.append("\n\n");
            }
        }
        return song.toString();
    }
}
