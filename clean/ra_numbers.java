import java.lang.Math;
public class ra_numbers {
    public static void main(String[] args) {
        int rand = (int) (Math.random()*(10)+1);
        System.out.println(rand);
    }

    public static void IsEven(int x) {
        if(x%2==0){
            System.out.println("Is Even");
        }else{
            System.out.println("Is Odd");
        }
    }
}
