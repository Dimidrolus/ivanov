/**
 * Created by dima on 22.02.17.
 */
public class Privat24 {
    public static void main(String[] args) {
        Bank bank1 = new Bank("PrivatBank");
        Bank bank2 = new Bank("BankAval");
        Bank bank3 = new Bank("BankMihailovski");
        Thread thread1 = new Thread(new Transaction(bank1,bank2, 50));
        Thread thread2 = new Thread(new Transaction(bank2,bank1, 65));
        Thread thread3 = new Thread(new Transaction(bank3,bank1, 65));
        Thread thread4 = new Thread(new Transaction(bank1,bank3, 65));
        Thread thread5 = new Thread(new Transaction(bank2,bank3, 90));
        Thread thread6 = new Thread(new Transaction(bank3,bank2, 20));





            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread6.start();

    }
 }
