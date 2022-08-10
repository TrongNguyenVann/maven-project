package hello;

import org.joda.time.LocalTime;

public class HelloWorld {

    public static void main(String[] args) {
        // Use time from joda library
        LocalTime currentTime = new LocalTime();

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello() + " at time " + currentTime);
    }
}