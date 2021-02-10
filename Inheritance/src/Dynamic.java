public class Dynamic{
        void eat(){System.out.println("animal is eating...");}
        }

class Dog extends Dynamic{
    void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        Dynamic a=new Dog();
        a.eat();
    }
}