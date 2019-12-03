package main.com.yash.spring.di2;

public class B {

	private int a;
	private String msg;

	public B(int a, String msg) {
		System.out.println("B : constructor based");
		this.a = a;
		this.msg = msg;
	}

	public void show() {
		System.out.println("B :show method");

	}

}
