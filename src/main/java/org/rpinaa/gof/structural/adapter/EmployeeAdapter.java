package org.rpinaa.gof.structural.adapter;

public class EmployeeAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return this.getFirstName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
