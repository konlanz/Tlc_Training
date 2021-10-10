public class Trade {
    private String id;
    private String Symbol;
    private int quantity;
    private double price;
    public static void main(String[] args) {
        
    }
    public Trade(){};
    public Trade(String id, String Symbol, int quantity, double price){
        this.id = id;
        this.Symbol = Symbol;
        this.quantity = quantity;
        this.price = price;
    }
    public Trade(String id, String Symbol, int quantity){
        this.id = id;
        this.Symbol = Symbol;
        this.quantity = quantity;
    }
    public void setPrice(double price){
        if(price>=0){
        this.price = price;
    }else{
        System.out.println("This is not a valid price");
    }
}


    public int  getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setSymbol(String symbol){
        this.Symbol = symbol;
    }
    public String getSymbol() {
        return Symbol;
    }
}
