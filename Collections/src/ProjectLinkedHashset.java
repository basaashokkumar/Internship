import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProjectLinkedHashset {
    public static void main(String[] args) {
        Set<Contact> set2=new LinkedHashSet<Contact>();
        //Creating Contact
        Contact b1=new Contact(1,"Amandeep",890987345);
        Contact b2=new Contact(2,"Malleshwari",908762313);
        Contact b3=new Contact(3,"Samson intern",908309382);
        //Adding Contacts to set
        set2.add(b1);
        set2.add(b2);
        set2.add(b3);
        //Traversing list
        for(Contact b:set2){

            System.out.println(b.sno+" "+b.name+" "+b.phone);
        }
        //System.out.println(set2);
        set2.contains("Ashok");
        set2.remove(b1);
        System.out.println("After deleting b1 object");
        for(Contact c:set2){
            System.out.println(c.sno+" "+c.name+" "+c.phone);
        }

    }
}
