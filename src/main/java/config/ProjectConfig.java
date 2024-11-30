package config;

import beans.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2(){
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

}
