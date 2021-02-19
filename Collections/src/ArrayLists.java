import java.util.*;
class ArrayLists{
    public static void main(String args[]){
        ArrayList<String> list1=new ArrayList<String>();//Creating arraylist
        list1.add("Ravi");//Adding object in arraylist
        list1.add("Vijay");
        list1.add("Ravi");
        list1.add("Ajay");
        ArrayList<Integer> list2=new ArrayList<Integer>();//Creating arraylist
        list2.add(12345678);//Adding object in arraylist
        list2.add(34567890);
        list2.add(51234567);
        list2.add(71234569);
        System.out.println(list1);
        System.out.println(list2);
        list1.remove("Ajay");
        System.out.println(list1);
//Traversing list through Iterator
        Iterator itr=list2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}