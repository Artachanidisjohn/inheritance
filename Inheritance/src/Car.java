
public class Car extends Machine {
	
	
	public void showInfo() {
		System.out.println("car name: "+name);
	}
	

	@Override
	public void Start() {
		System.out.println("car started");
	}

	public void full() {
		System.out.println("car full");
	}
}
