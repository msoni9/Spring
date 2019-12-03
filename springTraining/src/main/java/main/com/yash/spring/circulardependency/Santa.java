package main.com.yash.spring.circulardependency;

public class Santa {

	public Santa() {
		System.out.println("Creating instance of Santa");
	}

	private Banta banta;

	public void setBanta(Banta banta) {
		System.out.println("Setter property of Banta in instance of Santa");
		this.banta = banta;
	}

}
