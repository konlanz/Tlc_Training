import java.lang.Math;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        arrayTwo();
        
    }
    public static void arrayTwo(){
        Integer[] randArray = new Integer[6];
        Set<Integer> set = new HashSet<Integer>();
        
        int count = 0;
        while(count < randArray.length){
            int max = 49, min = 1;
            int rand = (int) (Math.random()*(max-min+1)+min);
            set.add(rand);
            count++;

        }
         randArray = set.toArray(randArray);
         insertSortFunction(randArray);
         //Arrays.sort(randArray);
        for (Integer i: randArray){
            
            System.out.println(i);
        }
        
        
    
    }
    //insert sort function
    public static void insertSortFunction(Integer[] array){
        int l = array.length;
        for(int k =1; k < l; k++){
            int key = array[k];
            int i = k-1;
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key; 
        }

    }

    
}
