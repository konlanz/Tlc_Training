
public class Trader {
    String name;
    Account accounts;
    public Trader(String name, Account acounts) {
        this.name = name;
        this.accounts = accounts;
    }
    public void addTrade(Trade trade) {
        double totalValue = trade.getQuantity() * trade.getPrice();
        accounts.setTotalTrade(totalValue);
    }
}