
class InvalidDeposit extends Exception{
    InvalidDeposit(String msg){
        super(msg);
    }
}
class InvalidWithDrawal extends Exception{
    InvalidWithDrawal(String msg){
        super(msg);
    }
}

class BankAccount{
    private final int accountNumber;
    private final String holderName;
    private double balance;
    static int totalAccounts=0;
    BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        totalAccounts+=1;
    }
     void Deposit(double addBalance) throws InvalidDeposit{
        if(addBalance<=0){
            throw new InvalidDeposit("Invalid Deposit Money");
        }
        balance+=addBalance;
        System.out.println("Deposited money successfully = "+addBalance);
    }

     void withdraw(double outmoney) throws InvalidWithDrawal,InvalidDeposit{
        if(balance<0) {
             throw new InvalidDeposit("You have 0 Balance and you cant Withdrawal Amount");
        }
        if(balance<outmoney){
            throw new InvalidWithDrawal("Insufficient Balance");
        }
        balance-=outmoney;
        System.out.println("Withdrew " + outmoney + " successfully.");
    }

   public void getBalance(){
        System.out.println("your balance is "+balance);
    }

     void displayInfo() {
        System.out.println("Account No: " + accountNumber + ", Name: " + holderName + ", Balance: " + balance);
    }
    static void displayAccountAll(){
        System.out.println("Total Account = "+totalAccounts);
    }
}

public class bank {
    public static void main(String[] args) {
        try{
            BankAccount acc1 = new BankAccount(1001, "Manoj", 5000);
            BankAccount acc2 = new BankAccount(1002, "Priya", 10000);
            acc1.Deposit(-500);
            acc1.withdraw(5000);
            acc1.getBalance();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
