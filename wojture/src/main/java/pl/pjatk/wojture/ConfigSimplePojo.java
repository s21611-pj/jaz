package pl.pjatk.wojture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigSimplePojo {

    @Bean
    public MySimplePojo mySimplePojo(){
        return new MySimplePojo(1,"some string value");
    }

    @Bean
    public List<String> defaultData(){
        return List.of("str1","str2","str3","str4","str5");
    }

    @Bean
    public List<MySimplePojo> mySimplePojoList(MySimplePojo mySimplePojo){
        return  List.of(mySimplePojo);
    }

    @Bean
    public int someInt() {
        return 1;
    }

//    praca domowa
    @Bean
    @ConditionalOnProperty(name="my.custom.boolean_flag", havingValue = "true")
    public MyHomeworkClass myHomeworkClass(
            @Value("${my.custom.value_for_test}") String customString
    ) {
        return new MyHomeworkClass(customString);
    }

}
