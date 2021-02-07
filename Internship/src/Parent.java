class Animal {
    //string color ="white";
    String color;
    void displaysColor()
    {
        System.out.println(color);
    }

}
class Cat extends Animal{
    String breed;

    void sound()
    {
        super.color="White";
        super.displaysColor();
        System.out.println(breed);
    }

}

public class Parent {
    public static void main(String args[])
    {
        Cat object1=new Cat();
        object1.breed="Maine coon";
        object1.sound();


    }

}

