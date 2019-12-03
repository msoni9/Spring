package main.com.yash.spring.di;

public class Hello {

	private Jack jack;
	private Jill jill;

	public Hello() {
		System.out.println("Hello Both of you");
	}

	public Jack getJack() {
		return jack;
	}

	public void setJack(Jack jack) {
		this.jack = jack;
	}

	public Jill getJill() {
		return jill;
	}

	public void setJill(Jill jill) {
		this.jill = jill;
	}

}
