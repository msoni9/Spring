package main.com.yash.spring.di3bytype;

public class N {

	private int a;
	private String msg;

	public N(int a, String msg) {
		System.out.println("B : constructor based");
		this.a = a;
		this.msg = msg;
	}

	public void show() {
		System.out.println("B :show method");

	}

}
