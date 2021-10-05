package Bank;

public class Bank {
    private String Owner;
    private double balance;
    public Bank(String owner, double StartingBalance){
        this.Owner = owner;
        this.balance = StartingBalance;
    }
    public String getOwner() {
        return Owner;
    };
    public double getBalance() {
        return balance;
    }
    public double depositBalance(double amt) {
        if(amt > 0){
            this.balance =this.balance + amt;
            return amt;
        }
        return 0;

    }
}
