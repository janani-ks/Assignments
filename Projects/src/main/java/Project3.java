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
		Student s = new Student ( "Janani", "5th" , 9.01 );
        s.update(9.30);
        String l = s.print();
        logger.log(l);
	}
}
