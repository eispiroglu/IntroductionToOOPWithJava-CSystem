package app;

class app {
    public static void main (String [] args) {
        BetweenBracketsApp.run();
    }
}

class BetweenBracketsApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Lutfen cumlenizi giriniz");
        String str = kb.nextLine();

        System.out.println(BetweenBrackets.subStringFinder(str));
    }
}

class BetweenBrackets {
    public static String subStringFinder(String str)
    {
        int indexOfLastBracket = -1;
        int indexOfBracket = -1;

        indexOfBracket = str.lastIndexOf('{');
        indexOfLastBracket = str.indexOf('}');

        if (indexOfBracket == -1 || indexOfLastBracket == -1 || indexOfBracket > indexOfLastBracket)
            return "Hatalı giriş";


        return str.substring(indexOfBracket + 1, indexOfLastBracket);

    }
}