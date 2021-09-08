package src.org.csystem.app;
 /*
 ---
 --
Çağrıldığında ekrana 01.01.1900 ve 31.12.2100 arasında 
rastgele bir tarihi yazan
printRandomDate isimli metodu yazınız. 
Metodun ekrana yazdırdığı tarih geçerli bir tarih olmalıdır. Rasgele tarihin Şubat ayına denk
gelmesi durumunda, seçilen yılın artık yıl olup olmamasına göre, Şubat ayı 29 çekebilecektir. 
Tarih ekrana aşağıdaki formatta yazdırılacaktır:
 --
 ---
 */
class App {
	public static void main(String [] args) 
	{		
		 CrapsSimulationApp.run();
	}
}

class CrapsSimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		CrapsSimulationPercentage cs = new CrapsSimulationPercentage();
		
		for (;;) {

			System.out.print("Kaç kez oynatmak istiyorsunuz?");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				break;
			
			System.out.println("-------------------------------");
			cs.play(n);
			System.out.printf("Kazanma olasılığı:%f%n", cs.percentage);
			System.out.println("-------------------------------");			
		}			
	}

}

class CrapsSimulationPercentage {
	public double percentage;

	public void play(int n) 
	{
		percentage = 0;

		int wCount = 0;

		CrapsSimulation craps = new CrapsSimulation();

		for (int i = 0; i < n; i++) {
			

			craps.play();

			if (craps.win)
				wCount++;
		}
		percentage = (double)wCount / n;
	}

}

class CrapsSimulation {
	public boolean win;

	public static int rollDice(java.util.Random r) 
	{
		return (r.nextInt(6) + 1) + (r.nextInt(6) + 1); 
	}

	public void rollForIndefinite(java.util.Random r, int result) 
	{
		int total;

		while ((total = rollDice(r)) != result && total != 7)
			;

		win = total == result;
	}

	public void play() 
	{
		
		java.util.Random r = new java.util.Random();

		int total = rollDice(r);

		switch (total) {
			case 7:
			case 11:
				win = true;
				break;
			case 2:
			case 3:
			case 12:
				win = false;
				break;
			default:
				rollForIndefinite(r, total);

			
		}
	}
}

