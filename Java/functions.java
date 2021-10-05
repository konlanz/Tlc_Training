
public class functions {
    public static double calculateMealPrice(double listedMealPrice, double taxRate, double tipRate ){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }
    public static void main(String[] args) {
        double cal = calculateMealPrice(50, 0.5, 2.5);
        System.out.println(cal);
        Math.
       
    }
    
}
