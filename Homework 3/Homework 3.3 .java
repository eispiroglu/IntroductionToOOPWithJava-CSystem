public static int calculateDigitalRoot (int val) 
	{
		while (val > 0) {
			int temp = 0;
			while (val > 10) {
				temp += val % 10;
				val /= 10;
			}
			val = temp;
		}
		return val;
	}