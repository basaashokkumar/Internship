import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSET {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Samson");
        list.add("Malleshwari");
        list.add("Amandeep");
        HashSet<String> set1=new HashSet<String>(list);
        System.out.println(set1.isEmpty());
        set1.add("JVM");
        set1.add("JRE");
        set1.add("JDK");
        set1.add("Java Features");
        System.out.println(set1);   //it gives in sorted order
        System.out.println(set1.isEmpty());
        System.out.println(set1.contains("Collections"));//it searches the set
        System.out.println(set1.size());
        System.out.println(set1.remove("Hello"));
        System.out.println(set1.remove("JDK"));
        Object se=set1.clone();
        System.out.println(se);
        Collection<?> objects = set1;
        //set1.removeAll(objects);
        set1.add("JRE");
        System.out.println(set1.size()+" "+set1);
        Iterator<String> itr= set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for (String itr1:set1
             ) {
            System.out.println(itr1);

        }



    }
}
