package com.simplilearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      obj.getName();
      
      ByeWorld obj1 = (ByeWorld) context.getBean("byeWorld");
      obj1.getMessage();
      obj1.getName();
      
   }
}