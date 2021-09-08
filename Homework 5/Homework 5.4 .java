package Example;

class App {
	public static void main(String [] args) 
	{
        FriendNumbers.run();
	}
}
class FriendNumbers {
	public static void run () 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		/*System.out.println("Lutfen ilk sayiyi giriniz");
		int valX = Integer.parseInt(kb.nextLine());

		System.out.println("Lutfen ikinci sayiyi giriniz");
		int valY = Integer.parseInt(kb.nextLine());*/

		for (int i = 1000; i < 10000; i++) {
			if(isPerfect(i))
				System.out.println(i);
		}
	}
	public static boolean isPerfect(int val) 
	{
		return NumberUtil.sumOfDividers(val) == val ? true : false;
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