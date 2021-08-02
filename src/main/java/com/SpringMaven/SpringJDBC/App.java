package com.SpringMaven.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


import com.sun.glass.ui.Application;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//StudentDao sdao=(StudentDao) context.getBean("student"); 
    	//int status=sdao.saveStudent(new Student("amir",112,"UP")); 
        //System.out.println("The record inserted" + status); 
        
    	JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	String query="insert into Student values(? ,? ,?)";
    	
    	int rel=jdbcTemplate.update(query);
    	System.out.println("Number of record inserted "+rel);
    	
    	
    	
    	
    	
    	
    	
    }
}
