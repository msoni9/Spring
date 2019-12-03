package main.com.yash.spring.bean.loading.type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

public class BeanConfig {
	
	@Bean
	@Scope("singleton")
	@Lazy(true)
	public Hello hello(){
		return new Hello();
	}

}
