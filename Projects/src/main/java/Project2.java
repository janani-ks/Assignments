import java.util.Scanner;
class Triangle{
    double side;
    double base;
    double height;
    Triangle(double s,double b,double h){
        this.side=s;
        this.base=b;
        this.height=h;
    } 
    void perimeter(){
        System.out.println("Perimeter of Triangle = "+ (side+base+height));
    }
    void area(){
        System.out.println("Area of Triangle = "+ 0.5*base*height);
    }
}
class Rectangle{
    double length;
    double width;
    Rectangle(double l,double w){
        this.length=l;
        this.width=w;
    }
    void perimeter(){
        System.out.println("Perimeter of Rectangle = "+2*(length+width));
    }
    void area(){
        System.out.println("Area of Rectangle = "+length*width);
    }
}
class Circle{
    double radius;
    Circle(double r){
        this.radius=r;
    }
    void perimeter(){
        System.out.println("Perimeter of Circle = "+2*3.14*radius);
    }
    void area(){
        System.out.println("Area of Circle = "+3.14*radius*radius);
    }

}
public class Project2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the choice you want : \n \t 1. Triangle \n \t 2. Rectangle \n \t 3. Circle");
        int n = s.nextInt();
        switch(n){
            case 1:
            Triangle t = new Triangle(4,5.6,7);
            t.perimeter();
            t.area();
            break;
            case 2:
            Rectangle r = new Rectangle(4.5,9);
            r.perimeter();
            r.area();
            break;
            case 3:
            Circle c = new Circle(5.4);
            c.perimeter();
            c.area();
            break;
        }      
}
}
