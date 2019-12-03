package main.com.yash.spring.di3bytype;

public class MNHello {

	private M mobj;
	

	@Override
	public String toString() {
		return "MNHello [mobj=" + mobj + "]";
	}

	public void setAobj(M mobj) {
		System.out.println("NewHello : Setter Based");
		this.mobj = mobj;
		System.out.println(mobj);
	}
	
	public MNHello(){
		//System.out.println(mobj);
	}

	
}
