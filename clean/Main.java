import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

    class Main {
        public static void main(String[] args) {
            List<Trade> trades = new ArrayList<>();
            trades.add(new Trade("Can", 121));
            trades.add(new Trade("Can1", 122));
            trades.add(new Trade("Can2", 123));
            trades.add(new Trade("Can3", 124));
            trades.add(new Trade("Can4", 125));
            trades.add(new Trade("Can5", 126));
            
            Optional<Trade> trade = getTradeBySymbol("Can3", trades);
            
            trade.ifPresentOrElse(
                    (Trade trade1)-> System.out.println(trade1),
                    ()-> System.out.println("Trade not found") 
            );
            Optional<Trade> trade4 = getTradeBySymbol("Can35", trades);
  
             trade4.ifPresentOrElse(
                    (Trade trade1)-> System.out.println(trade1),
                    ()-> System.out.println("Trade not found") 
            );
            
        }
        
        private static Optional<Trade> getTradeBySymbol(String symbol, List<Trade> trades) {
            return trades.stream()
                    .filter((Trade trade)-> trade.getSymbol().equals(symbol))
                    .findFirst();
        }
        
        
    }
