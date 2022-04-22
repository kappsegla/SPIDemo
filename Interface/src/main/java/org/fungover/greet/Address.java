package org.fungover.greet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Repeatable(Addresses.class)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface Address {
    String value() default "empty";
}
