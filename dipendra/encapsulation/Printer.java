package encapsulation;

public class Printer {
    private int tonerLevel;
    private int printedPagesCounter;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel < 0 && tonerLevel > 100) {
            this.tonerLevel = 0;
            return;
        }

        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
        this.printedPagesCounter = 0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPagesCounter() {
        return printedPagesCounter;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void fillToner(int tonerAmount) {
        if (tonerAmount < 0) {
            System.out.println("Invalid toner amount");
            return;
        }

        if (tonerAmount + tonerLevel > 100) {
            tonerLevel = 100;
            System.out.println("Toner filled but overflowed.");
            return;
        }

        tonerLevel += tonerAmount;
        System.out.println("Toner filled");
    }

    public void printPage() {
        if (isDuplex) {
            printedPagesCounter += 2;
            System.out.println("Page printed in duplex mode");
            return;
        }

        ++printedPagesCounter;
        --tonerLevel;
        System.out.println("Page printed");
    }
}
