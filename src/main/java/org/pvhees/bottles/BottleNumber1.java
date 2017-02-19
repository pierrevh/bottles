package org.pvhees.bottles;

public class BottleNumber1 extends BottleNumber{

    private int number;

    public BottleNumber1() {
        super(1);
    }

    @Override
    public String container() {
        return "bottle";
    }

    @Override
    protected String pronoun() {
        return "it";
    }

}
