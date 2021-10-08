public class Main{
    public static void main(String[] args) {
        System.out.println("Hello Ghana");
        Trade atrade = new Trade("12", "IBM",200, 500.25 );
        double price = atrade.getPrice();
        System.out.println(price);
        Account acc = new Account();
        Trader trader = new Trader("This is name", acc);
        
    }
}