import java.util.Locale;

public class Operation {
    public static void main(String[] args) {
        String str1,str2,str3,str4;
        String str5,str9;
        str1="Hello";
        str2="World";
        str5="Hellkj";
        str9="            Hello all";
        str3=str1.toLowerCase();
        str4=str2.toUpperCase();
        int len=str1.length();
        System.out.println(str1+" "+str2);
        System.out.println(str1.concat(str2));
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(len);
        System.out.println(str9.trim());
        System.out.println(str1.endsWith("el"));
        System.out.println(str1.endsWith("lo"));
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.startsWith("H"));
        System.out.println(str5.compareTo(str1));
    }
}
