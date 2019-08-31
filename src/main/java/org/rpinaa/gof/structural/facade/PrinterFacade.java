package org.rpinaa.gof.structural.facade;

public class PrinterFacade {

    private Printer printer;

    public PrinterFacade(final String text, final String documentType) {
        super();

        printer = new Printer()
                .setColor(true)
                .setDocumentType(documentType)
                .setText(text)
                .setSheet("A4");
    }

    public void print() {
        this.printer.printDocument();
    }
}
