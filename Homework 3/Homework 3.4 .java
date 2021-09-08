public static void isFactTest () 
	{
		for (int i = 3; i < 100000; i++) {
			if (isFactorian(i))
				System.out.println(i);
		}
	}
	public static int fact (int val) 
	{
		int result = 1;
		for (int i = val; i > 1; i--) {
			result *= i;
		}
		return result;
	}
	public static boolean isFactorian (int val) 
	{
		if (val == 1 || val == 2)
			return true;
		
		int sum = 0;
		int temp = val;
		while (val > 0) {
			sum += fact(val % 10);
			val /= 10;
		}
		if (temp == sum)
			return true;
		return false;
	}