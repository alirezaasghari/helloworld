package at.refugeescode.helloworld.hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {

    @Autowired
    private HelloWorld helloWorld;
    

    @Test
    void sayHelloWorld() {

        String message = helloWorld.sayHelloWorld();
        assertEquals("Hello World", message);
    }
}