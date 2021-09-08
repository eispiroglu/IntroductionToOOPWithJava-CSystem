package Example;

class App {
	public static void main(String [] args) 
	{
        EulerCalculatorApp.eulerCalculator();
	}
}
class EulerCalculatorApp {
	public static void eulerCalculator () 
	{
		double sum = 0;
		for (int i = 0; i < 13; i++) {
			sum += 1. / NumberUtil.factorial(i); 
		}
		System.out.println(sum);	
	}
}
class NumberUtil {
	public static int factorial (int val) 
	{
		int factorial = 1;
		for (int i = 1; i <= val ; i++) {
			factorial *= i;
		}
		return factorial;
	}
}