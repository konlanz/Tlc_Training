import java.lang.Math;
public class randTillZero {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        RandomTillZero();

    }

    public static void RandomTillZero() {  
        int rand;      
        do{
            int max = 3, min = -3;
            rand = (int) (Math.random()*(max-min+1)+min);
            System.out.println("The number is " + rand);
        }while(rand != 0);
    }
}
