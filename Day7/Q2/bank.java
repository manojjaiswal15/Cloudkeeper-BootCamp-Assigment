class BankAccount{
    int accountNumber;
    String holderName;
    double balance;
    BankAccount(){}
    BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
        System.out.println("name is :- "+this.holderName+" account no "+this.accountNumber+" balance is "+this.balance);
    }

}

public class Q2 {
    public static void main(String []args){
        BankAccount cus=new BankAccount(12345678,"Manoj",5000);
    }
}
