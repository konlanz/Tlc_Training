import java.lang.Math;
public class ra_numbers {
    public static void main(String[] args) {
        int rand = (int) (Math.random()*(100)+1);
        System.out.println(rand);
        IsEven(rand);
        tempX(rand);

    }
    //is even that is questions two first part;
    public static void IsEven(int x) {
        if(x%2==0){
            System.out.println("Is Even");
        }else{
            System.out.println("Is Odd");
        }
    }

    public static void tempX(int temp) {
    if(temp == 0) {
        System.out.println("frozen");
    }else if(temp <=14) {
        System.out.println("cool");

    }else if(temp<=24){
        System.out.println("cool");
    }else if(temp<=40){
        System.out.println("warm");
    }else if(temp<=60){
        System.out.println("hot");
    }else if(temp<=80){
        System.out.println("very hot");
    }else if(temp<=99){
        System.out.println("extremely hot");
    }else if(temp>=99){
        System.out.println("boiling");
    }
    }

}
