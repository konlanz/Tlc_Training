package Bank;

public class Bankmain {
    public static void main(String[] args) {
        Bank kodelan = new Bank("Konlan Mikpekoah", 1000.0);
        kodelan.depositBalance(6000);
        kodelan.withdrawBalance(200.56);
        System.out.println(kodelan.getOwner() + " Your actual bank balance is " + kodelan.getBalance());

    }
    
}
