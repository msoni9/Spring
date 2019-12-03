package main.com.yash.spring.aop.second;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfigration {
	
	/*@Bean
	public AnnotationAwareAspectJAutoProxyCreator autoProxyCreator(){
		
		return new AnnotationAwareAspectJAutoProxyCreator();
	}*/

	@Bean
	public SecurityService securityService(){
		return new SecurityService();
	}
	
	@Bean
	public TransactionService transactionService(){
		return new TransactionService();
	}
	
	@Bean(name = "accountService")
	public AccountService accountService(){
		return new AccountService();
	}
	
	@Bean(name = "customerService")
	public CustomerService customerService(){
		return new CustomerServiceImpl();
	}
	
	@Bean
	public LogService logService(){
		return new LogService();
	}
}
