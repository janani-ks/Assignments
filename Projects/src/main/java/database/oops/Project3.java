package oops;
class Student{
    private String studentname;
    private String gradelevel;
    private double gpa;
    Student(String sn,String gl,double g){
        this.studentname = sn;
        this.gradelevel = gl;
        this.gpa = g;
    }
    void update(double g){
        this.gpa = g;
    }
    String print(){
        return studentname+" has a GPA as "+gpa;
    }
}
public class Project3
{
	public static void main(String[] args) {
		try {
		Student s = new Student ( "Janani", "5th" , 9.01 );
		String s1 = "9.2";
		float f = Float.parseFloat(s1);
        s.update(f);
        String l = s.print();
        System.out.println(l);
		}
		catch(NumberFormatException e) {
            System.out.println("NumberFormatException occurred");
        }
	}
}
