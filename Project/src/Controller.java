import java.util.LinkedList;
import java.util.List;
import java.util.*;
class Contact {
    int sno;
    String name;
    long phone;
    public void contactApplication(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the contact details:");
        try {
            sno = scan.nextInt();
            scan.nextLine();
            name = scan.nextLine();
            phone = scan.nextLong();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    List<Contact> list = new ArrayList<Contact>();
    public int getAddContact() {
            return 0;
        }
        public void setAddContact(int sno,String name,long phone){
            this.sno=sno;
            this.name=name;
            this.phone=phone;
        }

    public int getDeleteContact() {
        return 0;
    }
    public void setDeleteContact(int sno,String name,long phone){
        this.sno=sno;
        this.name=name;
        this.phone=phone;
    }
    public int getUpdateContact() {
        return 0;
    }
    public void setUpdateContact(int sno,String name,long phone){
        this.sno=sno;
        this.name=name;
        this.phone=phone;
    }
    public int getSearchContact() {
        return 0;
    }
    public void setSearchContact(int sno,String name,long phone){
        this.sno=sno;
        this.name=name;
        this.phone=phone;
    }

    public void run(){
        System.out.println("1.Adding Contact");
        System.out.println("2.Deleting Contact");
        System.out.println("3.Updating Contact");
        System.out.println("4.Searching Contact");
        System.out.println("if any other number just re-enter");
        Scanner scan =new Scanner(System.in);
        int ch;
        ch= scan.nextInt();
        switch (ch){
            case 1:{
                getAddContact();
                break;
            }
            case 2:{
                getDeleteContact();
                break;
            }
            case 3:{
                getUpdateContact();
                break;
            }
            case 4:{
                getSearchContact();
                break;
            }
            default:
                System.out.println("Re-enter");
        }
    }

}
public class Controller {
    public static void main(String[] args) {
        Contact obj=new Contact();
        obj.run();
        //Creating list of Contact
       /*
        //Creating Contact
        Contact b1=new Contact();
        Contact b2=new Contact();
        Contact b3=new Contact();
        Contact b4=new Contact();
        //b1.contacts(1,"samson",986787980);
        //b2.contacts(2,"Amandeep",986793332);
        //b3.contacts(3,"Malleshwari",982919192);
        b1.contactApplication();
        b2.contactApplication();
        b3.contactApplication();
        b4.contactApplication();
        //Adding Contacts to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        //Traversing list
        for(Contact b:list){
            System.out.println(b.sno+" "+b.name+" "+b.phone);
        }
        //System.out.println(list);
        System.out.println("Searching for the element is in list");

        System.out.println(list.contains(b1));

        //list.remove(0);
        System.out.println("Element is removed so not found "+list.contains(b1));
        System.out.println("after deleting element in list");
        for(Contact c:list){
            System.out.println(c.sno+" "+c.name+" "+c.phone);
        }
        System.out.println("Updating contact");
        list.set(1,b1);
        for(Contact c:list){
            System.out.println(c.sno+" "+c.name+" "+c.phone);
        }

        */
    }


}