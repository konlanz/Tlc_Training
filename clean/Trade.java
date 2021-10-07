public class Trade{
    private String symbol;
    private double price;

    public Trade(String symbol,double price ){
        this.symbol = symbol;
        this.price = price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getSymbol(){
        return symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

}