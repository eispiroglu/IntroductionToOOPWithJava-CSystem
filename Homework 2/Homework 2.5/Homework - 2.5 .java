package csd;


class App {
	public static void main(String [] args) 
	{
		GoldbachApp.run();
	}
}
class GoldbachApp {
	public static void run () 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		for (;;) {
			int val = Integer.parseInt(kb.nextLine());

			if (val == 0)
				break;
			
			NumberUtil.printGoldbachPrimes(val);
		}
	}
}

class NumberUtil {
	public static void printGoldbachPrimes (int val) 
	{
		for (int a = 2; a < val; a++) {
			int b = val - a;
			if (isPrime(a) && isPrime(b) && a < b)
				System.out.printf("%d + %d = %d == %d \n", a, b, a + b, val);

		}
	}
	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;
		
		int sqrtVal = (int)Math.sqrt(val);
		
		for (long i = 11; i <= sqrtVal; i += 2)	
			if (val % i == 0)
				return false;
		
		return true;				
	}
}