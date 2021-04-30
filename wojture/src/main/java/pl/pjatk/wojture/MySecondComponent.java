package pl.pjatk.wojture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MySecondComponent {
    public MySecondComponent(
            MyFirstComponent myFirstComponent,
            MySimplePojo mySimplePojo,
            List<String> defaultData,
            List<String> mySimplePojoList,
            int someInt,
            MyHomeworkClass myHomeworkClass
        ) {
        myFirstComponent.printHelloMessage();
        System.out.println("Hello from MySecondComponent");
        mySimplePojo.printOutMe();
        System.out.println(defaultData);
        System.out.println(mySimplePojo);
        System.out.println(mySimplePojoList);
        System.out.println(someInt);
        myHomeworkClass.printCustomString();
    }


    public void printHelloMessage() {
        System.out.println("Hello from MySecondComponent from method printHelloMessage");

    }

}
