import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

    class Main {
        public static void main(String[] args) {
            System.out.println("Hello World!");
            Trade trade = new Trade("Ibm","IBM",200, 588 );
            double price = trade.getPrice();
            Account account = new Account();
            Trader trader = new Trader("Zion", account);
            trader.addTrade(trade);

        System.out.println(account.GetTotalTrade());
        }
        

        
        
    }
