package pl.pjatk.wojture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class MyThirdComponent {

//    public MyThirdComponent(ApplicationContext applicationContext) {
//        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
//        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
//        mySecondComponent.printHelloMessage();
//
//        System.out.println("Hello from MyThirdComponent");
//        myFirstComponent.printHelloMessage();
//        mySecondComponent.printHelloMessage();
//    }

//    public MyThirdComponent(){}

    public MyThirdComponent(
            MyFirstComponent myFirstComponent,
            MySecondComponent mySecondComponent,
            MySimpleClass mySimpleClass,
            MySimpleClass mySecondSimpleClass
    ){
        mySecondComponent.printHelloMessage();
        System.out.println("Hello from MyThirdComponent");
        System.out.println(mySimpleClass.getName());
        System.out.println(mySecondSimpleClass.getName());
    }
}
