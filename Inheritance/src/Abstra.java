abstract class Vehicle{
    //abstract void features();
    final void features(){
        System.out.println("BIKE->HONDA");
    }
}
class Bike extends Vehicle{
    void features(){
        System.out.println("Milage");
    }
}

public class Abstra {
    public static void main(String[] args) {
       Bike oj=new Bike();
       oj.features();

    }
}
