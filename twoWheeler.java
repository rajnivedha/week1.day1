package week1.day1;

public class twoWheeler {
			
	int noofwheels = 2;
	short noofmirrors = 2;
	long chasisNumber = 1234567890;
	boolean ispunctured = false;
	String bikename = "fascino";
	double distance = 649.03;
	
	public void bike()
	{
		System.out.println(noofwheels);
		System.out.println(noofmirrors);
		System.out.println(chasisNumber);
		System.out.println(ispunctured);
		System.out.println(bikename);
		System.out.println(distance);
		
	}
	
	public static void main (String[] args) {
		
		twoWheeler details = new twoWheeler();
		details.bike();
		
	}
}
		
	
	
