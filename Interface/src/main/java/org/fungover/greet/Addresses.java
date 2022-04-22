package org.fungover.greet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
public @interface Addresses {
    Address []value();
}
