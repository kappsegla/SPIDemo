import org.fungover.greet.Greeting;
import org.fungover.provide.EnglishGreeting;
import org.fungover.provide.SwedishGreeting;

module org.fungover.provider {
    requires org.fungover.greeting;
    provides Greeting with SwedishGreeting, EnglishGreeting;
}
