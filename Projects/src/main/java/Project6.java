
class Creditcard implements Cloneable{
    String name,num,exdate;
    Creditcard(String n,String n1,String e){
        this.name=n;
        this.num=n1;
        this.exdate=e;
    }
    public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
}

public class Project6
{
	public static void main(String[] args) {
	    try {
		Creditcard c = new Creditcard("JANANI","35464246562","08-01-2024");
		Creditcard c1 = new Creditcard("KOKILA","7385657657","17-03-2023");
		Creditcard c3 = (Creditcard)c.clone();
		System.out.println((c.num).equals(c1.num));
		System.out.println("Credit card Name : "+c3.name+"\nCredit card Number : "+c3.num+"\nExpired Date : "+c3.exdate);
	    }
		catch(CloneNotSupportedException c) {}
	}
}
