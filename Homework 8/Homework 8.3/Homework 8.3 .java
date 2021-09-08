package app;

import java.util.Locale;

class app {
    public static void main (String [] args) {
        StringsBetweenBrackets.run();
    }
}

class StringsBetweenBrackets {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Kelime");
        String str;
        for(;;) {
            str = kb.nextLine();
            if(str.equals("1"))
                break;
            StringUtil.replacingSpaces(str);
        }

    }
}

class StringUtil {
    public static void replacingSpaces(String str)
    {
        str = "(".concat(str);
        str = str.trim();
        str = str.concat(")");
        System.out.println(str);
    }
}