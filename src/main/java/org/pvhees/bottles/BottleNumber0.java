package org.pvhees.bottles;

public class BottleNumber0 extends BottleNumber {

    public BottleNumber0() {
        super(0);
    }

    @Override
    public String quantity() {
        return "no more";
    }

    @Override
    public String action() {
        return "Go to the store and buy some more";
    }

    @Override
    public BottleNumber successor() {
        return BottleNumberFactory.create(99);
    }
}
