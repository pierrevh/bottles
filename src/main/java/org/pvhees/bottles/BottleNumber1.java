package org.pvhees.bottles;

public class BottleNumber1 extends BottleNumber{

    public BottleNumber1() {
        super(1);
    }

    @Override
    public String container() {
        return "bottle";
    }

    @Override
    public String pronoun() {
        return "it";
    }

}
