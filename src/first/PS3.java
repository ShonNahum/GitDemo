package first;

public class PS3 extends PS4 {
	int a;
	public PS3(int a) { 
		super(a);
		this.a=a; 
		
	}
	public int increment() {
		a = a +1;
		return a;
	}

}
