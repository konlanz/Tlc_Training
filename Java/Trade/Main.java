import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

    class Main {
        public static void main(String[] args) {
            System.out.println("Hello World!");
            Trade trade = new Trade("Ibm","IBM",200 );
            trade.setPrice(100.00);
            double price = trade.getPrice();
        System.out.println(price);
        }
        

        
        
    }
