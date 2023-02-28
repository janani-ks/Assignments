package bankexception;

public class Account {
	private String accno;
    private String name;
    private double bal;
    Account(String num,String name,double bal){
        this.accno=num;
        this.name=name;
        this.bal=bal;
    }
    void deposite(double dep){
        this.bal=this.bal+dep;
    }
    void withdraw(double amount) throws InsufficientFundsException{
    	if((bal-500)>=amount){
            this.bal=this.bal-amount;
        }
        else {
            double needs = amount - bal+500;
            throw new InsufficientFundsException(needs);
        }
    }
    double display(){
        return this.bal;
    }
}
