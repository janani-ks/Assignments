
class Bank{
    private String acc_no;
    private String name;
    private long bal;
    Bank(String an,String n,long b){
        this.acc_no=an;
        this.name=n;
        this.bal=b;
    }
    void deposite(long d){
        this.bal=this.bal+d;
    }
    void withdraw(long d){
        this.bal=this.bal-d;
    }
    void display(){
        System.out.println("YOUR CURRENT BALANCE IS "+this.bal);
    }
}
public class Project1 {
    public static void main(String[] args){
        Bank b = new Bank("2R44435" , "JANANI" ,200000);
        b.deposite(12000);
        b.withdraw(1000);
        b.display();
    }
    
}
