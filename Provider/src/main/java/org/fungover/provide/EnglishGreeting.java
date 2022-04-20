package org.fungover.provide;

import org.fungover.greet.Greeting;

public class EnglishGreeting implements Greeting {
    public EnglishGreeting() {
        System.out.println("English created");
    }

    @Override
    public String greet() {
        return "Howdy!";
    }
}
