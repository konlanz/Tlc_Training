import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TradeTest {
    @Test
    void main() {
        Trade trade = new Trade();

    }
    @Test
    void setPrice(){
        Trade man = new Trade();
        man.setPrice(200.00);
        double exp = man.getPrice();
        assertEquals(200.00, exp);
    }
}
