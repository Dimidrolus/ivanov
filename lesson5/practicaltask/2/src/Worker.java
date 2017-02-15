/**
 * Created by dima on 14.02.17.
 */
public abstract class Worker extends Person  {

    public int salary;

    Worker(String name, int salary )
    {

        super(name);
        this.salary = salary;
    }

    public abstract void salary(int salary);

}
