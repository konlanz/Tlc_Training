public class Stock extends Product{
    private String exchange, ticker;
    public String getExchange() {
        return exchange;
    }
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }
    public String getTicker() {
        return ticker;
    }
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
    public Stock(String id, String exchange, String ticker) {
        this.exchange = exchange;
        this.ticker = ticker;
    }

    
}
