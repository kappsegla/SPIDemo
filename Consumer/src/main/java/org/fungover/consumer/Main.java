package org.fungover.consumer;

import org.fungover.greet.Greeting;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<Greeting> serviceLoader = ServiceLoader.load(Greeting.class);

        var greetings = serviceLoader.stream()
                .filter(provider-> provider.type().getSimpleName().startsWith("Swedish"))
                .map(ServiceLoader.Provider::get)
                .toList();

        for( Greeting greeting  : greetings ) {
            if( greeting.getClass().getSimpleName().startsWith("Swedish"))
                System.out.println(greeting.greet());
        }
    }
}
