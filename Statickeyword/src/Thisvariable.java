class A{
    int id=5;
    String name="Rohith";
    A(){
        //this();
        System.out.println(this);
        System.out.println("Congratulations!!!");
    }

    void show(){ System.out.println("Coding Topper :"+this.name);
    }

    void details(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("name of the student :"+name);
        System.out.println("id of the student :"+id);
        this.show();
    }

}

public class Thisvariable {
    public static void main(String[] args) {
        A t=new A();
        t.details(4,"Ashok");

    }
}
