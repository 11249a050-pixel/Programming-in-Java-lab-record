interface Bank{
    void deposit(double amount);
    void  withdraw(double amount);
    void displayBalance();
}
class Account implements Bank{
    int accountNo;
    String name;
    double balance;
    Account(int accountNo,String name,double balance){
        this.accountNo=accountNo;
        this.name=name;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount deposited:"+amount);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("amount withdrawn:" + amount);
        }
        else{
            System.out.println("insufficient balance");
        }
    }
    public void  displayBalance(){
        System.out.println("Account Number:" + accountNo);
        System.out.println("Account Holder:" +name);
        System.out.println("Current Balance:" +balance);
}
}
public class InterfaceDemo{
    public void main(String[] args){
        Account obj = new Account(101,"Arun",5000);
        System.out.println("------Account Details-------");
        obj.displayBalance();
        System.out.println("\n-----Deposit-------");
        obj.deposit(20000);
        obj.displayBalance();
        System.out.println("\n--------withdrawal-----");
        obj.withdraw(1500);
        obj.displayBalance();
    }
}