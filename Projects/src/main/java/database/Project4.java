package database;
import java.sql.*;
class Connect{
	Connection con;
	private static Connect si = null;
	private Connect() {	
	}
	public static Connect getInstance(){
        if (si == null)
            si = new Connect(); 
        return si;
    }
	void newconnect() {	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
  			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Janani7@");
  			Statement stmt=con.createStatement();
            System.out.println("inserting records");
            String sql="Insert into detail values(55,'Nivi')";
            stmt.executeUpdate(sql);
		}
		catch(Exception e){
   		 System.out.println(e);
   		 }
		
	}
	 void close() {
		 try {
		 System.out.println("Closes all open connection");
		 con.close();
		 }
		 catch(Exception e){
    		 System.out.println(e);
    		 }
}
}
public class Project4 {
	 public static void main(String[] args){
			Connect c = Connect.getInstance();
	   	    c.newconnect();
	   	    c.close();
		  }
}


