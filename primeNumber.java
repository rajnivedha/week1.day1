package week1.day1;

public class primeNumber {
	
	public static void main(String[] args) {
		int inp = 13;
		int rem;
		for (int i=2; i < inp/2; i++) {
			rem=inp%i;
			if (rem==0) {
				System.out.println(inp+ "Is not a prime number");
			}
			else {
				System.out.println(inp+ "Is a prime number");
			}
			
		break;
	}		}
				
					}
