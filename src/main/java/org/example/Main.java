package org.example;

public class Main {
    // Static variables
    static int staticHex = 0x2BB;
    static byte staticByte = 1;
    static String statingString = "Progress not perfection";

    // Instance variables
    int instanceBinary = 0b101101;
    int instanceOctal = 072;
    double instanceDouble = 1234.95;

    // Method to print local variables
    public void localVariables() {
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10_000_000L;
        String localString = "Every step I take gets me closer to my goal.";

        System.out.println("Local Variables:");
        System.out.println("  localDecimal = " + localDecimal);
        System.out.println("  localHex = " + localHex);
        System.out.println("  localBinary = " + localBinary);
        System.out.println("  localOctal = " + localOctal);
        System.out.println("  localLong = " + localLong);
        System.out.println("  localString = " + localString);
    }

    public void instanceVariables() {
        System.out.println("\nInstance Variables:");
        System.out.println("  instanceBinary = " + instanceBinary);
        System.out.println("  instanceOctal = " + instanceOctal);
        System.out.println("  instanceDouble = " + instanceDouble);
    }

    public static void staticVariables() {
        System.out.println("\nStatic Variables:");
        System.out.println("  staticHex = " + staticHex);
        System.out.println("  staticByte = " + staticByte);
        System.out.println("  statingString = " + statingString);
    }

    public static void main(String[] args) {
        Main demo = new Main();
        demo.localVariables();
        demo.instanceVariables();
        staticVariables();
    }
}
