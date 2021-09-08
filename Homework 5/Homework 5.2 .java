package Example;

class App {
	public static void main(String [] args) 
	{
        DividersSum.run();
	}
}
class DividersSum {
	public static void run () 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Lutfen sayinizi giriniz");
		int val = Integer.parseInt(kb.nextLine());

		System.out.printf("Sayinin carpanlarinin toplami = %d", NumberUtil.sumOfDividers(val));
	}
}
class NumberUtil {
	public static int sumOfDividers (int val) 
	{
		int sum = 0;
		for (int i = 1; i <= val / 2; i++) {
			if (val % i == 0)
				sum += i;
		}
		return sum;
	} 
}