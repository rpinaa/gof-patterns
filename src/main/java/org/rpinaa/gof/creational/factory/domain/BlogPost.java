package org.rpinaa.gof.creational.factory.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class BlogPost extends AbstractPost {

    private String author;
    private String[] tags;
}
