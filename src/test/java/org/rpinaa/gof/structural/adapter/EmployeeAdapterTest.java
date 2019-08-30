package org.rpinaa.gof.structural.adapter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.rpinaa.gof.structural.adapter.BusinessCardDesigner;
import org.rpinaa.gof.structural.adapter.Employee;
import org.rpinaa.gof.structural.adapter.EmployeeAdapter;
import org.rpinaa.gof.structural.adapter.EmployeeAdapterWithComposition;

@RunWith(JUnit4.class)
public class EmployeeAdapterTest {

    @Test
    public void designCard_whenAnEmployeeAdapterInstanceHasPassedInsideDesignCardMethod_shouldReturnACompleteStringCard() {

        final BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        final EmployeeAdapter employeeAdapter = new EmployeeAdapter();

        employeeAdapter.setFirstName("Ricardo Pina");
        employeeAdapter.setJobTitle("Technical Lead");
        employeeAdapter.setOfficeLocation("Miguel Hidalgo, CDMX, MEX");

        final String card = businessCardDesigner.designCard(employeeAdapter);

        Assert.assertNotNull(card);

        System.out.println(card);
    }

    @Test
    public void designCard_whenAnEmployeeAdapterWithCompositionInstanceHasPassedInsideDesignCardMethod_shouldReturnACompleteStringCard() {

        final BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        final Employee employee = new Employee()
                .setFirstName("Ricardo Pina")
                .setJobTitle("Technical Lead")
                .setOfficeLocation("Miguel Hidalgo, CDMX, MEX");

        final EmployeeAdapterWithComposition employeeAdapterWithComposition = new EmployeeAdapterWithComposition(employee);

        final String card = businessCardDesigner.designCard(employeeAdapterWithComposition);

        Assert.assertNotNull(card);

        System.out.println(card);
    }
}
