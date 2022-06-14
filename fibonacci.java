package week1.day1;

public class fibonacci {
	
	public static void main(String[] args) {
		
		int range = 8;
		int Num1 = 0;
		int Num2 = 1;
		int sum;
		
		System.out.println("Fibonacci Series");
		System.out.println(Num1);
		System.out.println(Num2);
		
		for (int i=1;i<range;i++)
		{
			sum = Num1 + Num2;
			System.out.println(sum);
			Num1 = Num2;
			Num2 = sum;
		}
	}
}
