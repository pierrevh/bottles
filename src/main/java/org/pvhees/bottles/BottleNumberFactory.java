package org.pvhees.bottles;

public class BottleNumberFactory {

    public static BottleNumber create(int number) {
        switch (number) {
            case 0 :
                return new BottleNumber0();
            case 1 :
                return new BottleNumber1();
            case 6 :
                return new BottleNumber6();
            default:
                return new BottleNumber(number);
        }
    }

}
