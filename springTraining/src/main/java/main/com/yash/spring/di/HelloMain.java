package main.com.yash.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String args[]) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationConfiguration.xml");

	}

}
