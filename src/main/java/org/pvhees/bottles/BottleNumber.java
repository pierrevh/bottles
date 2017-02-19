package org.pvhees.bottles;

public class BottleNumber {

    private int number;

    public BottleNumber(int number) {
        this.number = number;
    }

    public String container() {
        return "bottles";
    }

    public String quantity() {
        return Integer.toString(number);
    }

    public String action() {
        return "Take " + pronoun() +" down and pass it around";
    }

    protected String pronoun() {
        return "one";
    }

    public BottleNumber successor() {
        return BottleNumberFactory.create(number - 1);
    }

    @Override
    public String toString() {
        return quantity() + " " + container();
    }
}
