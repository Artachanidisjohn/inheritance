
public class App{
	
	public static void main(String[] args) {
		
		Machine machine1= new Machine();
			
		machine1.Start();
		machine1.Stop();
		
		Car car1= new Car();
		car1.Start();
		car1.full();
		car1.showInfo();
		car1.Stop();
		
	}
}