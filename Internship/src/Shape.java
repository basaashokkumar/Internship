import java.sql.SQLOutput;

class Square{
    void draw()
    {
        System.out.println("Now we are in super class");
    }

}


class Rectangle extends Square{

    void draw() {
        System.out.println("This method overrides the super class method");
    }
}



public class Shape {
    public static void main(String[] args) {
        Rectangle rec =new Rectangle();
        rec.draw();


    }
}
