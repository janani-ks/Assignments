package bankexception;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	static double amount = 0;
	static boolean store_balance() {
		Scanner scan = new Scanner(System.in);
		try {
		display.print("Balace Amount : ");
    	amount = scan.nextDouble();
    	return false;
		}
		catch(InputMismatchException e) {
	    return true;
		}
	}
	public static void main(String[] args) throws InsufficientFundsException{
    	Scanner scan = new Scanner(System.in);
    	Scanner scan1 = new Scanner(System.in);
    	String accountnumber;
    	String holdername;
    	int choice;
    	double depositeamount;
    	double withdrawamount;
    	display.println("Enter the Details to create account :");
    	display.print("Account Number : ");
    	accountnumber = scan.nextLine();
    	display.print("Account Holder's Name : ");
    	holdername =  scan.nextLine();
    	while(store_balance());
        Account obj = new Account(accountnumber , holdername ,amount);
        display.println("Enter the choice you want :\n 1.Deposite\n 2.Withdraw \n 3.Check Balance Enquiry");
        choice = scan1.nextInt();
        switch(choice) {
        case 1:
        	display.println("Enter the amount to deposite:");
        	depositeamount = scan1.nextDouble();
        	obj.deposite(depositeamount);
        	break;
        case 2:
        	display.println("Enter the amount to withdraw:");
        	withdrawamount = scan1.nextDouble();
        	try {
                obj.withdraw(withdrawamount);
            }
            catch (InsufficientFundsException e) {
                display.println("Sorry, but you are short $" + e.getAmount());
            }
        	break;
        case 3:
        	display.print("YOUR CURRENT BALANCE IS "+obj.display());
        	break;
        default:
        	display.println("Invalid choice");
        }
        display.println("\n---------Thank You----------");
    }

}
