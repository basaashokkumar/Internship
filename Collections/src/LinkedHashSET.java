import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSET {
    public static void main(String[] args) {
        LinkedHashSet<String> set1=new LinkedHashSet<String>();
        System.out.println(set1.isEmpty());
        set1.add("JVM");
        set1.add("JRE");
        set1.add("JDK");
        set1.add("JDK");
        set1.add("Java Features");
        System.out.println(set1);   //it gives in sorted order
        System.out.println(set1.isEmpty());
        System.out.println(set1.contains("Collections"));//it searches the set
        System.out.println(set1.size());
        System.out.println(set1.remove("Hello"));
        System.out.println(set1.remove("JDK"));
    }
}
