package com.springcore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! " ); 
        
    
  /*		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student s1 = (Student) context.getBean("student1");
        
        System.out.println("student 1");
        System.out.println(s1);
        
        System.out.println("student 2");
        
        Student s2 = (Student) context.getBean("student2");
        System.out.println(s2);
  */      
		
		
	ApplicationContext ct = new ClassPathXmlApplicationContext("config.xml");	
		Employee emp1 = (Employee) ct.getBean("employee1");
		
		System.out.println("name : " + emp1.getName());
		System.out.println( "courses : " + emp1.getCourses());
		System.out.println("phones : " + emp1.getPhones());
		System.out.println("Addresses : " + emp1.getAddresses());
		System.out.println("Employee props : " + emp1.getEmpProps());
		
		// traversing list of employee phones
		List<String> empList = emp1.getPhones();
		for(String e : empList) {
			System.out.println(e);
		}
		
    }
}
