package oops;
import java.io.*;
class InsufficientFundsException extends Exception {
	   private double amount;
	   
	   public InsufficientFundsException(double amount) {
	      this.amount = amount;
	   }
	   
	   public double getAmount() {
	      return amount;
	   }
	}
class Bank{
    private String accno;
    private String name;
    private long bal;
    Bank(String an,String n,long b){
        this.accno=an;
        this.name=n;
        this.bal=b;
    }
    void deposite(long d){
        this.bal=this.bal+d;
    }
    void withdraw(long d)throws InsufficientFundsException {
    	if(bal>=d){
        this.bal=this.bal-d;
    	}
    	else {
            double needs = double(d - bal);
            throw new InsufficientFundsException(needs);
         }
    	}
    long display(){
        return bal;
    }
}
public class Project1 {
    public static void main(String[] args){
        Bank b = new Bank("2R44435" , "JANANI" ,200000);
        b.deposite(12000);
        try {
        b.withdraw(2000000);
        }
        catch (InsufficientFundsException e) {
            logger.log("Sorry, but you are short $" + e.getAmount());
        }
        long l = b.display();
        logger.log("Your Current Balance is "+l);
    }
    
}
