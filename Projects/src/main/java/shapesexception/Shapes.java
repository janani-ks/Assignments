package shapesexception;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Shapes {
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	static boolean b=false;
	static double storedouble() {
		try {
			Scanner scan = new Scanner(System.in);
			b = true;
			return scan.nextDouble();
		}
		catch(Exception e) {
			b = false;
			return 0;
		}
	}
    public static void main(String[] args){
		double perimeter;
        double area;
        Scanner scan1 = new Scanner(System.in);
        display.println("Please enter the type you want as same as Displayed : \n \t 1. Triangle \n \t 2. Rectangle \n \t 3. Circle");
        String type = scan1.nextLine();
        int n;
        switch(type){
            case "Triangle":
            display.println("Enter the Triangle Base,Side and Height :");
            double side;
            while(1>0) {
            	side = storedouble();
            	if(b)
            		break;
            }
            b=false;
            double base;
            while(1>0) {
            	base = storedouble();
            	if(b)
            		break;
            }
            b=false;
            double height;
            while(1>0) {
            	height = storedouble();
            	if(b)
            		break;
            }
            b=false;
            Basicshapes t = new Basicshapes(side,base,height);
            n = 1;
            perimeter=t.perimeter(n);
            area=t.area(n);
            display.println("The perimeter of Triangle = "+perimeter);
            display.println("The area of Triangle = "+area);
            break;
            case "Rectangle":
            display.println("Enter the Rectangle Height and Width:");
            double height1;
            while(1>0) {
            	height1 = storedouble();
            	if(b)
            		break;
            }
            b=false;
            double width;
            while(1>0) {
            	width = storedouble();
            	if(b)
            		break;
            }
            b=false;
            Basicshapes r = new Basicshapes(height1,width);
            n = 2;
            perimeter=r.perimeter(n);
            area=r.area(n);
            display.println("The perimeter of Rectangle  = "+perimeter);
            display.println("The area of Rectangle = "+area);
            break;
            case "Circle":
            display.println("Enter the Circle Radius :");
            double radius;
            while(1>0) {
            	radius = storedouble();
            	if(b)
            		break;
            }
            b=false;
            Basicshapes c = new Basicshapes(radius);
            n = 3;
            perimeter=c.perimeter(n);
            area=c.area(n);
            display.println("The perimeter of Circle = "+perimeter);
            display.println("The area of Circle = "+area);
            break;
            default:
            display.println("Please Enter the choice between the range 1 to 3");
            break;
        }
        display.println("--------------------X---------------------");
}
}


