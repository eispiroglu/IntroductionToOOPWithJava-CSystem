package Example;

class App {
	public static void main(String [] args) 
	{
        AverageCalculatorApp.run();
	}
}

class AverageCalculatorApp {
    public static void run () 
    {
        boolean operation = true;
        int min = 0, max = 0, count = 0, sum = 0;;
        double average;
        java.util.Scanner kb = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.println("Lutfen bir sayi giriniz.");
            int val = Integer.parseInt(kb.nextLine());

            while(!isOkay(val)) {
                System.out.println("Gecersiz sayi girdiniz, lutfen yeni bir sayi giriniz.");
                val = Integer.parseInt(kb.nextLine());
            }

            sum += val;

            if (count == 1) {
                min = val;
                max = val;
            }
            else {
                if (val < min) 
                    min = val;
                else if (val > max)
                    max = val;
            }

			System.out.println("Yeni bir deger girmek istiyor musunuz? [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]");
			int decider = Integer.parseInt(kb.nextLine());
			operation = willContinue(decider);


        }while(operation);

        average = NumberUtil.averageCalculator(sum, count); 
        
        displayResults(max, min, average, count);
    }
	public static void displayResults(int max, int min, double average, int count) 
	{	
		System.out.println("---------------------------");
		System.out.printf("%d adet sayi girildi%n", count);
		System.out.printf("Max = %d%n", max);
        System.out.printf("Min = %d%n", min);
        System.out.printf("Ortalama = %f%n", average);
		System.out.println("---------------------------");
	}
    public static boolean isOkay(int val) 
    {
        return val > 0 && val < 100 ? true : false;
    }
    public static boolean willContinue (int decider) 
    {
		return decider == 1 ? true : false;
    }
}
class NumberUtil {
    public static double averageCalculator (int sum, int count) 
    {
        return (double)sum / count;
    }
}
