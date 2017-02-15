/**
 * Created by dima on 14.02.17.
 */
public class Cleaner extends Worker {


    private final PersonType PERSON_TYPE;


    Cleaner(String name, int salary) {
        super(name, salary);

        PERSON_TYPE = PersonType.Cleaner;
        System.out.println(PERSON_TYPE +" created");
    }


    @Override
    public void salary(int salary) {
        double x;
        x = (salary*80)-(salary*90*0.12);
        System.out.println("My salary is " + x);



    }

    @Override
    public void print() {
        System.out.println("My name is " + this.name );

    }
}
