class Principal{
    int tid=105;
    int hid=110;
    int sid=115;
    int pid=100;
    void display()
    {
        System.out.println("Principal Id :"+pid);
    }


}
class Teacher extends Principal{
    void show_details(){
        System.out.println("Teacher Id:"+tid);
    }

}
class Hod extends Principal{
    void show_details(){
        System.out.println("Hod Id:"+hid);
    }
}
class Students extends Principal{
    void show_details(){
        super.display();
        System.out.println("Student Id:"+sid);
    }
}
public class Collegehierarchical {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.show_details();
        Hod h=new Hod();
        h.show_details();
        Students s=new Students();
        s.show_details();
        //System.out.println();
    }
}
