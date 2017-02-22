/**
 * Created by dima on 22.02.17.
 */
public class Transaction implements Runnable {
    Bank sender;
    Bank getter;
    int summ;
    int id = (int) (Math.random()*200);


    Transaction(Bank sender, Bank getter, int summ)
    {
        this.sender = sender;
        this.getter = getter;
        this.summ = summ;
    }


    @Override
    public void run() {
        Bank.Tranfer(sender,getter,summ,id);

    }

    }
