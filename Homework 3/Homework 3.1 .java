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
		for (int i = 0; i < 9999999; i++) {
			if(NumberUtil.isOkay(i))
				System.out.println(i);
		}
	}
	
}

class SatisfyConditionsApp {
	public static boolean 
}

class NumberUtil {
	public static boolean isOkay(int val) 
	{
		int reversedVal = reversed(val);
	
		if (reversedVal > val)
			if (isPrime(val) && isPrime(reversedVal))
				if (isPrime(val / 10) && isPrime (reversedVal / 10))
					if (isPrime(val % 100) && isPrime(reversedVal % 100))
						return true ;
		
		return false;
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
		
		for (long i = 11; i * i <= val; i += 2)	
			if (val % i == 0)
				return false;
		
		return true;				
	}
	public static int reversed(int val)
	{
		int result = 0;
		
		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}
		
		return result;
	}
}