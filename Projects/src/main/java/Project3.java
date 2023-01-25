class Student{
    private String stu_name;
    private String gra_level;
    private double CGPA;
    Student(String sn,String gl,double g){
        this.stu_name = sn;
        this.gra_level = gl;
        this.CGPA = g;
    }
    void update(double g){
        this.CGPA = g;
    }
    String print(){
        return stu_name+" has a GPA as "+CGPA;
    }
}
public class Project3
{
	public static void main(String[] args) {
		Student s = new Student ( "Janani", "5th" , 9.01 );
        s.update(9.30);
        String l = s.print();
        System.out.println(l);
	}
}
