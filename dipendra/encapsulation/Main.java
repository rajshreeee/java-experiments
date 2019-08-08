package encapsulation;

public class Main {
    public static void main(String args[]) {
        Printer printer = new Printer(10, true);

        printer.fillToner(100);
        printer.printPage();

        System.out.println("Toner Level: " + printer.getTonerLevel());
        System.out.println("Printed Page Count: " + printer.getPrintedPagesCounter());
        System.out.println("Is Duplex? " + printer.isDuplex());
    }
}
