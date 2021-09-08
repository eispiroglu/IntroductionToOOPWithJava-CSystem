package src.org.csystem.app;
 /*
 ---
 --
Çağrıldığında ekrana 01.01.1900 ve 31.12.2100 arasında 
rastgele bir tarihi yazan
printRandomDate isimli metodu yazınız. 
Metodun ekrana yazdırdığı tarih geçerli bir tarih olmalıdır. Rasgele tarihin Şubat ayına denk
gelmesi durumunda, seçilen yılın artık yıl olup olmamasına göre, Şubat ayı 29 çekebilecektir. 
Tarih ekrana aşağıdaki formatta yazdırılacaktır:
 --
 ---
 */
class App {
	public static void main(String [] args) 
	{		
		java.util.Random random = new java.util.Random();

		for (int i = 0; i < 60; i++)
			DateUtil.printRandomDate(random);
	}
}


class DateUtil {

	public static boolean isLeapYear (int year) 
	{
		return year % 100 != 0 || year % 4 == 0 || year % 400 == 0;
	}

	public static int getDays(int month, int year) 
	{
		int days = 31;

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
		case 2:
			days = isLeapYear(year) ? 29 : 28;
		
		}

		return days;
	}

	public static String getSuffix(int day) 
	{
		String suffix = "th";

		switch (day) {
			case 1:
			case 21:
			case 31:
				suffix = "st";
				break;
			case 2:
			case 22:
				suffix = "nd";
				break;
			case 3:
			case 23:
				suffix = "rd";
				break;
		}

		return suffix;
	}

	public static String getMonthSuffix(int month) 
	{
		String monthStr = " ";
		
		switch (month) {
		case 1:
			monthStr = "Jan";
			break;			
		case 2:
			monthStr = "Feb";
			break;
		case 3:
			monthStr = "Mar";
			break;
		case 4:
			monthStr = "Apr";
			break;
		case 5:
			monthStr = "May";
			break;
		case 6:
			monthStr = "Jun";
			break;
		case 7:
			monthStr = "Jul";
			break;
		case 8:
			monthStr = "Aug";
			break;
		case 9:
			monthStr = "Sep";
			break;
		case 10:
			monthStr = "Oct";
			break;
		case 11:
			monthStr = "Nov";
			break;
		case 12:
			monthStr = "Dec";
			break;
		}

		return monthStr;

	}


	public static void printRandomDate(java.util.Random random) 
	{
		int year = random.nextInt(2100 - 1900 + 1) + 1900;
		int month = random.nextInt(12) + 1;
		int days = random.nextInt(getDays(month, year) + 1);

		
		System.out.println("--------------");
		System.out.printf("%02d/%02d/%02d%n", days, month, year);
		System.out.printf("%d%s %s %d%n", days, getSuffix(days), getMonthSuffix(month), year);
		System.out.println("--------------");


	}
}
