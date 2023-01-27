class BasicPoint implements Cloneable {
	String x;
	String y;
	BasicPoint(String x1,String y1){
		this.x=x1;
		this.y=y1;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	static void Clone(){
		try {
		BasicPoint s = new BasicPoint("4.6","8");
		logger.log((s.x).equals(s.y)); 
		BasicPoint s1 = (BasicPoint)s.clone();
		logger.log(s1.x+" "+s1.y);
		}
		catch(CloneNotSupportedException c) {
			;
		}
}
}
public class Project5
{
	public static void main(String[] args) {
		BasicPoint.Clone(); 
		
		
	}
}

