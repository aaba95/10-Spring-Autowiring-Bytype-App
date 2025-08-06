package com.cjc.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Student stu = context.getBean("stu",Student.class);
		
		System.out.println("Roll No : "+stu.getRollno());
		System.out.println("Name : "+stu.getName());
		System.out.println("CityName : "+stu.getAddress().getCityname());
		System.out.println("AreaName : "+stu.getAddress().getAreaname());
		
	}
}
