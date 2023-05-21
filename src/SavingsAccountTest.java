import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    @org.junit.jupiter.api.Test
    void pay() {
        SavingsAccount test1 = new SavingsAccount("Netology", 100000, 100);
        boolean operation = test1.pay(99000);
        assertTrue( operation);
    }

    @org.junit.jupiter.api.Test
    void add() {
        SavingsAccount test2 = new SavingsAccount("Nikita", 1000, 200);
        boolean operation2 = test2.add(2000);
        assertTrue(operation2);
    }
}