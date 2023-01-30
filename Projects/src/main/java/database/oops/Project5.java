package oops;
class BasicPoint implements Cloneable{
	String x;
	String y;
	BasicPoint(String x1,String y1){
		this.x=x1;
		this.y=y1;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
}
public class Project5
{
	public static void main(String[] args) throws CloneNotSupportedException{
		BasicPoint s = new BasicPoint("4.6","8");
		System.out.println((s.x).equals(s.y)); 
		BasicPoint s1 = (BasicPoint)s.clone();
		System.out.println(s1.x+" "+s1.y);
	}
}
