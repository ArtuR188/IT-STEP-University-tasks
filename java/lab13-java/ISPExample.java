interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class SimplePrinter implements Printer {
    public void print() {
        System.out.println("Printing");
    }
}

class MFD implements Printer, Scanner, Fax {
    public void print() {
        System.out.println("MFD Printing");
    }
    public void scan() {
        System.out.println("MFD Scanning");
    }
    public void fax() {
        System.out.println("MFD Faxing");
    }
}

public class ISPExample {
    public static void main(String[] args) {
        Printer p = new SimplePrinter();
        p.print();

        MFD mfd = new MFD();
        mfd.print();
        mfd.scan();
        mfd.fax();
    }
}
