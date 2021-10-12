public interface ProductPricingService {
    double price(String exchange, String ticker); //this is for stocks
    double price(String exchange, String contractCode, int month, int year);
    
}
