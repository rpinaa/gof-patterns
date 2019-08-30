package org.rpinaa.gof.structural.adapter;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Employee {

    private String jobTitle;
    private String firstName;
    private String officeLocation;
}
