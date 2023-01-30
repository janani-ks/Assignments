package oops;
import java.io.IOException;
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
    double perimeter(){
        return side+base+height;
    }
    double area(){
    	try {
        return 0.5*base*height;
    }
    	catch (ArithmeticException a) {
    		System.out.println("You're multplying by zero!");
            return 0.0;
        }
    }
}
class Rectangle{
    double length;
    double width;
    Rectangle(double l,double w){
        this.length=l;
        this.width=w;
    }
    double perimeter(){
        return 2*(length+width);
    }
    double area(){
        return length*width;
    }
}
class Circle{
    double radius;
    Circle(double r){
        this.radius=r;
    }
    double perimeter(){
        return 2*3.14*radius;
    }
    double area(){
        return 3.14*radius*radius;
    }

}
public class Project2 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the choice you want : \n \t 1. Triangle \n \t 2. Rectangle \n \t 3. Circle");
        int n = s.nextInt();
        double a1;
        double a2;
        switch(n){
            case 1:
            Triangle t = new Triangle(4.4,5.4,6);
            a1=t.perimeter();
            a2=t.area();
            System.out.println("Perimeter of Triangle "+a1);
            System.out.println("Area of Triangle "+a2);
            break;
            case 2:
            Rectangle r = new Rectangle(4.5,9);
            a1=r.perimeter();
            a2=r.area();
            System.out.println("Perimeter of Rectangle "+a1);
            System.out.println("Area of Rectangle "+a2);
            break;
            case 3:
            Circle c = new Circle(5.4);
            a1=c.perimeter();
            a2=c.area();
            System.out.println("Perimeter of Circle "+a1);
            System.out.println("Area of Circle "+a2);
            break;
            default:
            break;
        }
}
}