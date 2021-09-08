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
		
		System.out.println("Lutfen ilk sayiyi giriniz");
		int valX = Integer.parseInt(kb.nextLine());

		System.out.println("Lutfen ikinci sayiyi giriniz");
		int valY = Integer.parseInt(kb.nextLine());

		if (areFriends(valX, valY))
			System.out.println("Bu iki sayi arkadastir.");
		else 
			System.out.println("Bu iki sayi arkadas degildir.");
	}
	public static boolean areFriends(int valX, int valY) 
	{
		return NumberUtil.sumOfDividers(valX) == valY && NumberUtil.sumOfDividers(valY) == valX ? true : false;
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







/*----------------------------------------------------------------------------
TEST KODU
------------------------------------------------------------------------------*/

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
			for (int j = i + 1; j <= 10000; j++) {
				
				if (areFriends(i, j)) {
					System.out.printf("Sayilar = %d, %d ", i, j);
					System.out.println("Bu iki sayi arkadastir.");
				}
				/*else 
					System.out.println("Bu iki sayi arkadas degildir.");*/
			}
		}
	}
	public static boolean areFriends(int valX, int valY) 
	{
		return NumberUtil.sumOfDividers(valX) == valY && NumberUtil.sumOfDividers(valY) == valX ? true : false;
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