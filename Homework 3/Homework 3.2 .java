public static boolean isPrimeX(int val) 
	{
		boolean isPrime = true;

		while(val > 10 && isPrime == true) {
			if (!isPrime(val))
				isPrime = false;
			int temp = 0;
			while (val > 0) {
				temp += val % 10;
				val /= 10;
			}
			val = temp;
		}
		return isPrime;
		
	}