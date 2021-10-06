package Learn_it;
import java.util.Arrays;
import  java.util.Random;

public class random {
    public static void main(String[] args){
       
        int[] arr;
        arr = new int[6];
        int count =0;
        while (count < arr.length){
            Random r = new Random();
            arr[count]= r.nextInt(50);
            count++;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
