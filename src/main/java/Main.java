public class Main {
    public static void main(String[] args) {
        Account sberBank = new SavingsAccount("Одуванчик", 20000, 1000 );
        Account vtbBank = new CheckingAccount("Ромашка", 50000);
        Account tinkoffBank = new CreditAccount("Мухомор", 1000000);
        System.out.println(sberBank.add(500000));
        System.out.println(sberBank.pay(5000000));
        System.out.println(vtbBank.add(500));
        System.out.println(vtbBank.pay(10000));



    }
}