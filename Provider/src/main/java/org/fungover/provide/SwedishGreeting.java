package org.fungover.provide;

import org.fungover.greet.Greeting;

public class SwedishGreeting implements Greeting {
    @Override
    public String greet() {
        return "Hej hej!";
    }
}
