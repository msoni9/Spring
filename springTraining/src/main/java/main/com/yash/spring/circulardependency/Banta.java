package main.com.yash.spring.circulardependency;

public class Banta {

	public Banta() {
		System.out.println("Creating instance of Banta");
	}

	private Santa santa;

	public void setSanta(Santa santa) {
		System.out.println("Setting property Santa of Banta instance");
		this.santa = santa;
	}

}
