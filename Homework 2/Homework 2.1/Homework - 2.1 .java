package csd;


class App {
	public static void main (String [] args) 
	{
		Shape.run();
	}
}

class Shape {
	public static void run() 
	{
		System.out.println("Lutfen n sayisini giriniz");
		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int n = Integer.parseInt(kb.nextLine());
		
		displayShape(n);
	}
	public static void displayShape(int n) 
	{

		for (int i = 1; i < n ; i++) {
			printingSpaces(n, i);
			printingStars(n, i);	
			System.out.print("\n");
			}
		
		for (int i = n; i > 0; i--) {
			printingSpaces(n, i);
			printingStars(n, i);	
			System.out.print("\n");
		}
	}
	public static void printingSpaces(int n, int i) 
	{
		while (i < n) {
			System.out.print(" ");
			i++;
		}
	}
	public static void printingStars(int n, int i) 
	{
		if (i == 1) {
			System.out.printf("*");
			return;
		}
		for (int j = 0; j < (i * 2) - 1 ; j++) {
			System.out.printf("*");
		}
	}
}