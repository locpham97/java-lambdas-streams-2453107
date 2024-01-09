package com.example;

import java.util.Random;

    public class Main {

    public static void main(String[] args) {

    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

    Greeting greeting2 = () -> System.out.println("Hello World");
    greeting2.sayHello();

    Calculator calculator = (x, y) -> {
        Random random = new Random();
        int randomValue = random.nextInt(50);
        return x + y + randomValue;
    };

    System.out.println(calculator.caculator(5,19));

  }
}
