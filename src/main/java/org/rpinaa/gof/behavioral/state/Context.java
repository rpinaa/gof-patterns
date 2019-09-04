package org.rpinaa.gof.behavioral.state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context {

    private State state;

    public Context(){
        state = null;
    }
}
