package org.pvhees.bottles;

public class Bottle {

    private int number;

    public Bottle(int number) {
        this.number = number;
    }

    public String count() {
        return number == 0 ? "no more" : Integer.toString(number);
    }

    public String container() {
        return number == 1 ? "bottle" : "bottles";
    }

    public String subjectOfRemoval() {
        return number == 1 ? "it" : "one";
    }
}
