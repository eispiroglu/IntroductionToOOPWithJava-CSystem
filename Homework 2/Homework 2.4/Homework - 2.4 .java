package csd;


class App {
	public static void main(String [] args) 
	{
		Util.run();
	}
}

class Util {
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.println("Please enter the height");
		int height = Integer.parseInt(kb.nextLine());
		System.out.println("Please enter the width");
		int width = Integer.parseInt(kb.nextLine());
		
		display(height, width);
	}

	public static void display(int height, int width)
	{
		int countHeight = 0;
		int countWidth = 0;
		int direction = 1; // Direction 1 is for right direction
						   // Direction -1 is for left direction
		
		while (countHeight < height) {
			System.out.print("|");
			displayInside(countWidth, width, direction);
			System.out.println("|");

			countHeight++;
			countWidth++;
			if (countWidth >= width - 1) {
				countWidth = 0;
				direction *= -1;
			}
		}
	}
	public static void displayInside(int count, int width, int direction)
	{
		if (direction == 1)
			displayToRight(count, width);
		else
			displayToLeft(count, width);
	}


	public static void displayToRight(int count, int width) 
	{
		displaySpaces(count);
		System.out.print("*");
		displaySpaces(width - count - 1);
	}
	public static void displayToLeft(int count, int width) 
	{
		displaySpaces(width - count - 1);
		System.out.print("*");
		displaySpaces(count);
	}
	public static void displaySpaces (int width) 
	{
		for (int i = 0; i < width; i++)
			System.out.print(" ");
	}
}