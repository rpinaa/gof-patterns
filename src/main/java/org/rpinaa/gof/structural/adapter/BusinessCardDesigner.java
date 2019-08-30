package org.rpinaa.gof.structural.adapter;

public class BusinessCardDesigner {

    public String designCard(final Customer customer) {

        return customer.getName() +
                "\n" +
                customer.getDesignation() +
                "\n" +
                customer.getAddress();
    }
}
