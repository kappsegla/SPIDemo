package org.fungover.provide;

import org.fungover.greet.Greeting;

public class EnglishGreeting implements Greeting {
    @Override
    public String greet() {
        return "Howdy!";
    }
}
