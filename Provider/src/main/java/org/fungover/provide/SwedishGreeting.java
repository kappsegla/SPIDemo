package org.fungover.provide;

import org.fungover.greet.Address;
import org.fungover.greet.Greeting;

 @Address("swedish")
public class SwedishGreeting implements Greeting {

    public SwedishGreeting() {
        System.out.println("Swedish created");
    }

    @Override
    @Address("swedish")
    @Address("extra")
    public String greet() {
        return "Hej hej!";
    }
}
