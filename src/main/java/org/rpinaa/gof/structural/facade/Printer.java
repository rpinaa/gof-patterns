package org.rpinaa.gof.structural.facade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Printer {

    private String text;
    private String sheet;
    private boolean color;
    private String documentType;

    public void printDocument() {

        System.out.println(this.toString());
    }
}
