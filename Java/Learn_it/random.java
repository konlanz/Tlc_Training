package Learn_it;
import  java.util.Random;

public class random {
    public static void main(String[] args){
       
        int[] arr;
        arr = new int[6];
        int count =0;
        while (count < arr.length){
            Random r = new Random();
            arr[count]= r.nextInt();
            count++;
        }

        System.out.println(arr.length);

    }
    
}
