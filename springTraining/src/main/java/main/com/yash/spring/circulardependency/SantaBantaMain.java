package main.com.yash.spring.circulardependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SantaBantaMain {

	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext ace = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
	}
}
