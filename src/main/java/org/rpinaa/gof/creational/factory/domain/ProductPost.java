package org.rpinaa.gof.creational.factory.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class ProductPost extends AbstractPost {

    private String name;
    private String imageURL;
}
