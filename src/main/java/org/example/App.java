package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
//        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/applicationContext.xml");
//        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
//        helloWorld.getMessage();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld)context.getBean("HelloWorld");
        helloWorld.getMessage();


    }
}
