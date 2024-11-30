package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";
    private Parrot parrot;

    public Person(@Qualifier("parrot2")Parrot p){
        this.parrot = p;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setParrot(Parrot p){
        this.parrot = p;
    }

    public String getName(){
        return name;
    }

    public Parrot getParrot(){
        return parrot;
    }

}
