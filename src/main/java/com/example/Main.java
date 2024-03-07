package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("spring-bean.xml");
		Person person = (Person) factory.getBean("personByType");
		System.out.println("personByType  " + person.getAddress().getCity());

//		person = (Person) factory.getBean("personByType");
//		System.out.println("personByType  " + person.getAddress().getCity());
	}
}