package pl.pjatk.wojture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {
    public MyFirstComponent(
            @Value("${my.custom.property}") String valueProperty,
            @Value("${my.custom.random:some default value from @value}") String randomValueProperty
    ) {
        System.out.println("Hello from MyFirstComponent");
        System.out.println("my custom property >>>> " + valueProperty + "\n" + randomValueProperty);
    }

    public void printHelloMessage() {
        System.out.println("Hello from MyFirstComponent from method printHelloMessage");
    }
}
