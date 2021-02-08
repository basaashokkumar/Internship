class Teamlead{
    String name=new String("Malleswari");
    void teamlead(){
        //System.out.println("");
    }

}
class Mentor extends Teamlead{
    String name1=new String("Amandeep");
    void mentor(){
       System.out.println("TeamLead name:"+name);
        System.out.println("Mentor name:"+name1);
    }
}

public class Singlelevel {
    public static void main(String[] args) {
        Mentor ob=new Mentor();
        ob.mentor();
        ob.teamlead();

    }
}
