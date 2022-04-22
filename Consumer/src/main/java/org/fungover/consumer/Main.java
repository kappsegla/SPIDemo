package org.fungover.consumer;

import org.fungover.greet.Address;
import org.fungover.greet.Greeting;

import java.util.ServiceLoader;

public class Main {



    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException {

        ServiceLoader<Greeting> serviceLoader = ServiceLoader.load(Greeting.class);

//        var greetings = serviceLoader.stream()
//                .filter(provider-> provider.type().getSimpleName().startsWith("Swedish"))
//                .map(ServiceLoader.Provider::get)
//                .toList();

        for (Greeting greeting : serviceLoader) {
            var annotation = greeting.getClass().getAnnotation(Address.class);
            if( annotation == null)
                System.out.println("No annotation of type Address found");
            else
                System.out.println("Annotation Address with value: " + annotation.value());

            var methodannotation = greeting.getClass().getMethod("greet")
                    .getAnnotation(Address.class);

            if( methodannotation != null )
                System.out.println("Annotaded method: " + methodannotation.value());

            var fields = Test.class.getDeclaredFields();
            for (var field: fields) {
                System.out.println(field.getName());
                field.setAccessible(true);
                field.set(new Test(), "new value");
            }


        }
    }
}
