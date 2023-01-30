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
			String str = "Janani7@";
			Class.forName("com.mysql.cj.jdbc.Driver"); 
  			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root",str);
  			Statement stmt=con.createStatement();
            logger.log("inserting records");
            String sql="Insert into detail values(55,'Nivi')";
            stmt.executeUpdate(sql);
		}
		catch(Exception e){
   		 logger.log(e);
   		 }
		
	}
	 void close() {
		 try {
		 logger.log("Closes all open connection");
		 con.close();
		 }
		 catch(Exception e){
    		 logger.log(e);
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


