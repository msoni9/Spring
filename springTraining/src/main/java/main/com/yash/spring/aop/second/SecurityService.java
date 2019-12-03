package main.com.yash.spring.aop.second;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {

	@Pointcut(value = "execution(* main.com.yash.spring.aop.second.AccountService.my*(..))")
	public void method1() {

	}

	@Pointcut(value = "execution(* main.com.yash.spring.aop.second.CustomerService.up*(..))")
	public void method2() {

	}

	@Around(value = "method1() or method2()")
	public void verifyUser(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		System.out.println("SecurityService  verifyUser Begin ===");

		proceedingJoinPoint.proceed();

		System.out.println("SecurityService  verifyUser End ===");
	}
}
