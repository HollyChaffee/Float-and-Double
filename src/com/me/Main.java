package com.me;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3; //int cannot handle remainder because int only handles whole numbers
        float myFloatValue = (float) 5 / 3; //Float more precise, can handle decimal point - casting here but would normally use f suffix
        double myDoubleValue = 5d / 3d; //Double also more precise, can handle decimal point, more precise than float
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double numberOfLbs = 2d;
        double convertedKilograms = numberOfLbs * 0.45359237d;
        System.out.println("Converted pounds to Kilograms= " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
