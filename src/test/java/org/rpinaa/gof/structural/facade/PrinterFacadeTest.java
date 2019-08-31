package org.rpinaa.gof.structural.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PrinterFacadeTest {

    @Test
    public void printFacade_afterCreateFacadeInstances_shouldPrintAllDocumentAttributes() {

        final PrinterFacade firstFacade = new PrinterFacade("firstText", "xls");

        firstFacade.print();

        final PrinterFacade secondFacade = new PrinterFacade("secondText", "doc");

        secondFacade.print();

        new Printer()
                .setSheet("A3")
                .setColor(true)
                .setDocumentType("pdf")
                .setText("This is just a proof")
                .printDocument();
    }
}
