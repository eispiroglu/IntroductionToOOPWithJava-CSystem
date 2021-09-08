package csd;

class App {
	public static void main(String [] args) 
	{	
		PrintPrimeFactorApp.run();
	}
}
class PrintPrimeFactorApp {
	public static void run () 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		for (;;) {
			System.out.println("Sayi gir");

			int n = Integer.parseInt(kb.nextLine());

			if (n == 0)
				break;
			
			NumberUtil.printPrimeFactors(n);
			System.out.println();
		}
	}
}
class NumberUtil {
	public static void printPrimeFactors(int n) 
	{	
		if (n == 0)
			return;

		int i = 2;

		while (n != 1) {
			if (n % i  == 0) {
				System.out.printf("%d ", i);
				n /= i;
			}
			else i++;
		}
	}
}