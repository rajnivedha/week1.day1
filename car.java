package week1.day1;

public class car {
	
	public void applybreak() {
		System.out.println("Break applied");
		
	}
	public void applygear() {
		System.out.println("Gear is working");
			
	}
	public void switchonac() {
		System.out.println("Turn on the Ac");
		
	}
	public void applyaccelerator() {
		System.out.println("increase the speed");
		
	}
		public static void main(String[] args) {
		car vehicle = new car();
		vehicle.applybreak();
		vehicle.applygear();
		vehicle.switchonac();
		vehicle.applyaccelerator();
		
	}

}
