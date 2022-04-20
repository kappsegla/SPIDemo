package org.fungover.provide;

import org.fungover.greet.Greeting;

public class SwedishGreeting implements Greeting {

    public SwedishGreeting() {
        System.out.println("Swedish created");
    }

    @Override
    public String greet() {
        return "Hej hej!";
    }
}
