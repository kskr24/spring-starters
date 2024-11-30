package org.example;

import beans.Parrot;
import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        Parrot pp = p.getParrot();

        System.out.println(p.getName());
        System.out.println(pp.getName());
    }
}