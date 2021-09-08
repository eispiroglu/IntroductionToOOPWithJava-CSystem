package src.org.csystem.app;

class App {
	public static void main(String [] args) 
	{		
		
		
		ReverseCharCapitalsApp.run();
	}
}

class ReverseCharCapitalsApp {
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Lutfen kelimenizi giriniz, çıkmak için 1 giriniz.");
		String str;
		for(;;) {
			str = kb.nextLine();
			if(str.equals("1"))
				break;
			
			System.out.println(StringUtil.changeCase(str));
		}


	}
}
class StringUtil {
	public static String changeCase(String str) 
	{	
		String letters = "abcçdefgğhıijklmnoöprsştuüvyzwx";
		String invertedString = "";
		boolean isLowerCase;

		for (int i = 0; i < str.length(); i++) {
			isLowerCase = false;
			for (int j = 0; j < letters.length(); j++) {
				if (str.charAt(i) == letters.charAt(j)) {
					invertedString = invertedString.concat((str.substring(i,i+1)).toUpperCase());
					isLowerCase = true;
					break;
				}
			}
			if (!isLowerCase)
				invertedString = invertedString.concat((str.substring(i,i+1)).toLowerCase());
		}
		return invertedString;
	}
}