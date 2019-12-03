package main.com.yash.spring.di2;

public class NewHello {

	private A aobj;
	private B bobj;

	public NewHello(B bobj) {
		System.out.println("NewHello : Constructor based");
		this.bobj = bobj;
	}

	public void setAobj(A aobj) {
		System.out.println("NewHello : Setter Based");
		this.aobj = aobj;
	}

	public void show() {
		System.out.println("NewHello : Show method");
		aobj.show();
		bobj.show();
	}

}
