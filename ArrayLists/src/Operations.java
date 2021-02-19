import java.util.*;
public class Operations {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>(6);
        System.out.println(list+" "+list.size());
        list.add("Hello");
        list.add("wolrd");
        list.add("java Intern");
        list.add("fullcreative");
        list.add("Anywhere Works");
        list.trimToSize();
        System.out.println(list+" "+list.size());
        System.out.println(list.indexOf("fullcreative"));
        list.remove(0);
        System.out.println(list+" "+list.size());

        Object clonelist;
        clonelist=list.clone();
        System.out.println(clonelist);
       // list.clear();
        System.out.println(list);
        System.out.println(list.indexOf("Hello"));
        ArrayList<Integer> li=new ArrayList<Integer>();
        li.add(3);
        li.add(5);
        li.add(7);
        System.out.println(li.indexOf(7));
        Object[] objtoarray = list.toArray();
        int x;
        for(x=0;x< objtoarray.length;x++){
            System.out.println(objtoarray);
        }
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(String str:list){
            System.out.println(str);
        }
        System.out.println(list.get(0));
        System.out.println(list.set(0,"Java Collections"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);



    }
}
