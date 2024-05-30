package com.todo.Springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Hibernate123.xml");
        
       
        Emp emp1 = (Emp) context.getBean("emp");
        
        System.out.println(emp1);
    }
}
