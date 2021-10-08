import java.lang.Math;
import java.util.Scanner; 

public class rangeSix {
    public static void main(String[] args) {
        System.out.println("Helooo Ghana");
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number \n");
        int num = sc.nextInt();
        rangeNumbers(num);
    }
    public static void rangeNumbers( int number){
        int max = number, min = 1;
        int rand;
        int i = 0;
        while(i<6){
            rand = (int) (Math.random()*(max-min+1)+min);
            System.out.println(rand);
            i++;
        }

    }
}
