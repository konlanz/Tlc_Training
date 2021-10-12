public class Stock extends Product{
    private String exchange, ticker; 
    private final ProductPricingService productPricingService;
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
    public Stock(String id, String exchange, String ticker, ProductPricingService product_pricing_service) {
        this.exchange = exchange;
        this.ticker = ticker;
        this.productPricingService = product_pricing_service;
    }
    @Override
    public double getPrice() {
        return this.productPricingService.price(this.exchange, this.ticker);
    }


    
}
