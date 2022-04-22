package org.fungover.provide;

import org.fungover.greet.Address;
import org.fungover.greet.Greeting;
import org.jetbrains.annotations.NotNull;

@Address("swedish")
public class SwedishGreeting implements Greeting {

    public SwedishGreeting() {
        System.out.println("Swedish created");
    }

    @Override
    @Address("on method")
    public String greet() {
        return "Hej hej!";
    }

//    @NotNull
//    public String test(){
//        return null;
//    }

}
