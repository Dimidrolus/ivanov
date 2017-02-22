/**
 * Created by dima on 22.02.17.
 */
public class Bank {
    String name;

    public int safe = 10000000;

    Bank(String name) {
        this.name = name;

    }

    synchronized static void Tranfer(Bank sender, Bank getter, int summ, int transId) {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Starting transaction from " + sender.name + " to " + getter.name + " transactionid is: " + transId*i);
            getter.safe = getter.safe + summ;
            sender.safe = sender.safe - summ;
            System.out.println("Transaction complete, " + summ + "UAH sended");
            System.out.println(getter.name + " safe " + getter.safe);
            System.out.println(sender.name + " safe " + sender.safe);
//                        try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
