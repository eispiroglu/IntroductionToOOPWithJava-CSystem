package src.org.csystem.app;

class App {
	public static void main(String [] args) 
	{		
		GameSimApp.run();
	}
}

class GameSimApp {
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());

		GameSim gameSim = new GameSim(n);

		gameSim.run();

		System.out.printf("1. Oyunu kazanma olasılığı = %f%n", gameSim.game1Prob);
		System.out.printf("2. Oyunu kazanma olasılığı = %f%n", gameSim.game2Prob);
		System.out.printf("3. Oyunu kazanma olasılığı = %f%n", gameSim.game3Prob);
	}
}

class GameSim {
	public int count;
	public double game1Prob;
	public double game2Prob;
	public double game3Prob;

	public GameSim(int n) 
	{
		count = n;
	}

	public void run() 
	{
		int winCount1, winCount2, winCount3;
		winCount1 = winCount2 = winCount3 = 0;
		java.util.Random r = new java.util.Random();
		Games game = new Games(r);

		for(int i = 0; i < count; i++) {
			game.play();

			if(game.hasWonGame1)
				winCount1++;
			
			if(game.hasWonGame2)
				winCount2++;

			if(game.hasWonGame3)
				winCount3++;
			
			game1Prob = (double)winCount1 / count;
			game2Prob = (double)winCount2 / count;
			game3Prob = (double)winCount3 / count;
		}
	}
	

}

class Games {
	public boolean hasWonGame1;
	public boolean hasWonGame2;
	public boolean hasWonGame3;
	public java.util.Random random;

	public Games(java.util.Random r) 
	{
		random = r;
	}
	public int getRandom() 
	{
		return random.nextInt(99) + 1;
	}
	public int getFirst() 
	{
		return getRandom();
	}
	public int getSecond(int first) 
	{
		int second = 0;
		while ((second = getRandom()) == first);

		return second;
	}
	public int getThird(int first, int second) 
	{
		int third = 0;
		while((third = getRandom()) == second || third == first);
		return third;
	}
	public void game1(int first, int second, int third) 
	{
		hasWonGame1 = first + second + third < 150;
	}
	public void game2(int first, int second, int third) 
	{
		hasWonGame2 = NumberUtil.isPrime(first + second + third);
	}
	public void game3(int first, int second, int third) 
	{
		int max = Math.max(Math.max(first, second), third);
		int min = Math.min(Math.min(first, second), third);
		int mid = first + second + third - max - min;

		hasWonGame3 = max - min > mid;
	}
	public void play() 
	{
		int first = getFirst();
		int second = getSecond(first);
		int third = getThird(first, second);

		game1(first, second, third);
		game2(first, second, third);
		game3(first, second, third);
	}
}

class NumberUtil {
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