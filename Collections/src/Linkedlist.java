import java.util.*;
public class Linkedlist{
    public static void main(String args[]){

        LinkedList<String> li=new LinkedList<String>();
        li.add("Samson");
        li.add("Amandeep");
        li.add("Malleswari");
        li.add("Ashok");
        System.out.println(li);
        //LinkedList<String> lis=new LinkedList<String>();
        Object lis=li.clone();
        System.out.println(lis);
        System.out.println(li.getFirst()+" "+li.getLast()+" "+li.get(1));
        //System.out.println(li.set(1,"JAVA INTERN"));
        //System.out.println(li.set(3,"Team Lead"));
        System.out.println("Peek the first element AND last element "+li.peekFirst()+" "+li.peekLast());
        System.out.println(li.peek());
        System.out.println(li.size());
        System.out.println(li.poll()+" "+li.pollFirst()+" "+li.pollLast());
        System.out.println(li.set(0,"Samson Intern"));
        li.add("Amandeep Mentor");
        //System.out.println(li.set(1,"Amandeep Mentor"));
        System.out.println(li);
        //li.remove();
        //li.remove(1);
       // li.pop();
        li.push("Malleshwari Team Lead");
        System.out.println(li);
        System.out.println(li.indexOf("Amandeep Mentor"));
        System.out.println(li.lastIndexOf("Ashok"));
        System.out.println(li.size());

        Iterator<String> itr=li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}