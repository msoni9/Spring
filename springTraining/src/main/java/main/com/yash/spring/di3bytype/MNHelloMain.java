package main.com.yash.spring.di3bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MNHelloMain {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
		MNHello bean = (MNHello) context.getBean("MNHello");
		System.out.println(bean.toString());
		System.out.println("container is ready");
	}
}
