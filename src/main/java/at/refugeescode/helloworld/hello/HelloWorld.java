package at.refugeescode.helloworld.hello;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public String sayHelloWorld() {
        return "Hello World";
    }
}
