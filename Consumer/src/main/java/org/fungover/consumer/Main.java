package org.fungover.consumer;

import org.fungover.greet.Greeting;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<Greeting> serviceLoader = ServiceLoader.load(Greeting.class);

        for( Greeting greeting  : serviceLoader ) {
            System.out.println(greeting.greet());
        }
    }
}
