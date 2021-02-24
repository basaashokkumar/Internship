import java.util.*;
class Contact {
    int sno;
    String name;
    long phone;
    public Contact(int sno, String name,  long phone) {
        this.sno = sno;
        this.name = name;
        this.phone=phone;
    }
}
public class Cnta {
    public static void main(String[] args) {
        //Creating list of Contact
        List<Contact> list=new LinkedList<Contact>();
        //Creating Contact
        Contact b1=new Contact(1,"Amandeep",890987345);
        Contact b2=new Contact(2,"Malleshwari",908762313);
        Contact b3=new Contact(3,"Samson",908309382);
        //Adding Contacts to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(Contact b:list){
            System.out.println(b.sno+" "+b.name+" "+b.phone);
        }
        //System.out.println(list);
        list.contains("Ashok");
        list.remove(0);
        for(Contact c:list){
            System.out.println(c.sno+" "+c.name+" "+c.phone);
        }
    }
}