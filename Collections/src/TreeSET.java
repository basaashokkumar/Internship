import java.util.Iterator;
import java.util.TreeSet;
public class TreeSET {
    public static void main(String[] args) {

        TreeSet<String> set3=new TreeSet<String>();
        set3.add("Java");
        set3.add("C++");
        set3.add("C");
        set3.add("Python");
        Iterator itr= set3.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        TreeSet<Integer> set4=new TreeSet<Integer>();
        set4.add(9);
        set4.add(2);
        set4.add(5);
        set4.add(0);
        Iterator itr3= set4.descendingIterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        //System.out.println(set4);
       // System.out.println(set4.pollFirst()+" "+set4.pollLast());
       // System.out.println(set4);

        System.out.println("Initial Set: "+set4);

        System.out.println("Reverse Set: "+set4.descendingSet());

        System.out.println("Head Set: "+set4.headSet(5, true));

        System.out.println("SubSet: "+set4.subSet(2, false, 5, true));

        System.out.println("TailSet: "+set4.tailSet(0, false));
    }
}
