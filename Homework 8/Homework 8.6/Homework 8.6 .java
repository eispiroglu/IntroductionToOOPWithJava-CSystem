package src.org.csystem.app;

class App {
	public static void main(String [] args) 
	{		
		NameCheckerApp.run();
	}
}

class NameCheckerApp {
	
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Lutfen kelimenizi giriniz, çıkmak için 1 giriniz.");
		String str;
		for(;;) {
			str = kb.nextLine();
			if(str.equals("1"))
				break;
			
			if(NameChecker.isValidVariable(str)) {
				System.out.println("GEÇERLİ");
				break;
			}
				
			System.out.println("GEÇERSİZ");
		}
	}

}

class NameChecker {
	public static boolean isValidVariable(String str) 
	{
		if (StringUtil.rule1(str)) 
			if (StringUtil.rule2(str))
				if (StringUtil.rule3(str))
					if (StringUtil.rule4(str))
						return true;
		return false;
	}
}

class StringUtil {
	public static boolean rule1(String str) 
	{
		String lowerLetters = "abcçdefgğhıijklmnoöprsştuüvyzwx";
		lowerLetters = lowerLetters.toUpperCase();
		for (int i = 0; i < lowerLetters.length(); i++) {
			if (str.startsWith(lowerLetters.substring(i, i+1)))
				return false;
		}
		return true;
	} 
	public static boolean rule2(String str) 
	{
		String lowerLetters = "0123456789";
		for(int i = 0; i < lowerLetters.length(); i++) {
			if (str.startsWith(lowerLetters.substring(i, i+1)))
				return false;
		}
		return true;
	}
	public static boolean rule3(String str) 
	{
		return !str.contains(" ");
	}
	public static boolean rule4(String str) 
	{
		return !str.contains("&");
	}
}