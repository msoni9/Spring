package main.com.yash.spring.di2;

public class A {

	private int a;
	private String msg;

	public A() {
		System.out.println("A : default Constructor");
	}

	public void setA(int a) {
		System.out.println("A class setter int a");
		this.a = a;
	}

	public void setMsg(String msg) {
		System.out.println("A class setter String msg");
		this.msg = msg;
	}

	public void show() {
		System.out.println("A : show method");

	}

}
