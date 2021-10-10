import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class testArray {
    @Test
    void testArr(){
        int[] first = new int[10];
        for (int i = 0; i < first.length; i++){
            first[i] = i+1;
        }
        assertEquals(first[8], 9);
        
    }
}
