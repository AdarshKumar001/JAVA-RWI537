package com.Spring;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("StringStudent.xml");
        
        
        Stduent123 stu = (Stduent123) context.getBean("stu1");
        
        System.out.println(stu);
    }
}
