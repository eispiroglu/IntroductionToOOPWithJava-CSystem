package csd;

class App {
	public static void main(String [] args) 
	{	
		DisplayDurationTest.run();
	}
}
class DisplayDurationTest {
	public static void displayDuration(long totalSeconds) 
	{
		long hours = totalSeconds / 60 / 60; 
		long minutes = totalSeconds / 60 % 60;
		long seconds = totalSeconds % 60;

		if (hours != 0)
			System.out.printf("%d saat", hours);
		
		if (minutes != 0)
			System.out.printf(" %d dakika", minutes);

		if (seconds != 0)
			System.out.printf(" %d saniye", seconds);

		System.out.println();
	}
	public static void run () 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		for(;;) {
			System.out.println("Saniye giriniz");
			long totalSeconds = Long.parseLong(kb.nextLine());

			displayDuration(totalSeconds);
			System.out.println("------------------------");

		}
	}
}
