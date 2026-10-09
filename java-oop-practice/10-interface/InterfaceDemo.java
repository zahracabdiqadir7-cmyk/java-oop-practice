interface Printable {
    void print();
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing student report");
    }
}


class Invoice implements Printable {
    @Override
    public void print() {
        System.out.println("Printing invoice");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable item = new Report();
        item.print();

        // U yeerida Invoice-ka cusub
        Printable invoiceItem = new Invoice();
        invoiceItem.print();
    }
}