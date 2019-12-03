package main.com.yash.spring.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewHelloMain {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfiguration.xml");

		System.out.println("container is ready");
	}

}
