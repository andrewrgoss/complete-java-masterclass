package com.andrewgoss;

public class Printer {
    private double tonerLevel;
    private int numPagesToPrint;
    private boolean duplexPrinter;

    public Printer(double tonerLevel, int numPagesToPrint, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numPagesToPrint = numPagesToPrint;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(double pctFill) {
        System.out.println("Starting toner level: " + tonerLevel);
        tonerLevel += pctFill;
        if (tonerLevel < 100) {
            System.out.println("New toner level: " + tonerLevel);
        } else {
            System.out.println("Toner maximum level of 100% exceeded: " + tonerLevel);
        }

    }

    public void print() {
        System.out.println("Printing " + numPagesToPrint + " page(s)...");
        if (duplexPrinter) {
            numPagesToPrint = (int) Math.ceil((double)numPagesToPrint / 2);
        } else {
            numPagesToPrint += 1;
        }
        System.out.println("Total number of pages printed: " + numPagesToPrint);
    }
}
