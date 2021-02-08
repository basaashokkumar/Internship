/*class Teamlead{
    String name=new String("Malleswari");
    void teamlead(){
        System.out.println("Details");
    }

}
class Mentor extends Teamlead{
    String name1=new String("Amandeep");
    void mentor(){
        System.out.println("TeamLead name:"+name);
        System.out.println("Mentor name:"+name1);
    }
}*/

class Intern extends Mentor{
    String name2="ASHOK";
    void details()
    {
        System.out.println("TeamLead name:"+name);
        System.out.println("Mentor name:"+name1);
        System.out.println("Intern:"+name2);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Intern ob=new Intern();
        //ob.mentor();
        //ob.teamlead();
        ob.details();

    }
}
