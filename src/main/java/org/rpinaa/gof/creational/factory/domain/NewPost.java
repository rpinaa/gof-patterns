package org.rpinaa.gof.creational.factory.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Getter
@Setter
@Accessors(chain = true)
public class NewPost extends AbstractPost {

    private String headline;
    private LocalDate newsTime;
}
