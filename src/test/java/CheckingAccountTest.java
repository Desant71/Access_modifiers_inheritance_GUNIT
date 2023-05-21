import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    @Test
    void pay() {
        CheckingAccount test3 = new CheckingAccount("Yulia", 30000);
        boolean operation3 = test3.pay(31000);
        assertFalse(operation3);
    }
}