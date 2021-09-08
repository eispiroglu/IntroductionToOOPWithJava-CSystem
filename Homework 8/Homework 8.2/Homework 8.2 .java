package app;

class app {
    public static void main (String [] args) {
        CharactersOfAString.run();
    }
}

class CharactersOfAString {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Lutfen kelimenizi giriniz, cikmak icin 'xd giriniz' ");
        String str;

        for (;;){
            str = kb.nextLine();
            if(str.equals("1"))
                break;
            StringUtil.displayCharacters(str);
        }
   }
}

class StringUtil {
    public static void displayCharacters(String mainString)
    {
        for (int i = 1; i <= mainString.length(); i++) {
            System.out.println(mainString.substring(0,i));
        }
    }
}