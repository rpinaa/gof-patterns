package org.rpinaa.gof.structural.adapter;

public class EmployeeAdapterWithComposition implements Customer {

    private Employee employee;

    public EmployeeAdapterWithComposition(final Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return this.employee.getFirstName();
    }

    @Override
    public String getDesignation() {
        return this.employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.employee.getOfficeLocation();
    }
}
