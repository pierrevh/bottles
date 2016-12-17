package org.pvhees.bottles;

public class BottleNumber {

    private int number;

    public BottleNumber(int number) {
        this.number = number;
    }

    public String container() {
        if (number == 1) {
            return "bottle";
        } else {
            return "bottles";
        }
    }

    public String quantity() {
        if (number == 0) {
            return "no more";
        } else {
            return Integer.toString(number);
        }
    }

    public String action() {
        if (number == 0) {
            return "Go to the store and buy some more";
        } else {
            return "Take " + pronoun() +" down and pass it around";
        }
    }

    private String pronoun() {
        if (number == 1) {
            return "it";
        } else {
            return "one";
        }
    }

    public BottleNumber successor() {
        if (number == 0) {
            return new BottleNumber(99);
        } else {
            return new BottleNumber(number - 1);
        }
    }
}
