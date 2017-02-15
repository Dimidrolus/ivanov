/**
 * Created by dima on 14.02.17.
 */
public class Teacher extends Worker {

    private final PersonType PERSON_TYPE;

    Teacher(String name, int salary) {
        super(name, salary);
        PERSON_TYPE = PersonType.Teacher;
        System.out.println(PERSON_TYPE +" created");
    }


    @Override
    public void salary(int salary) {
        double x;
        x = (salary*80)-(salary*80*0.15);
        System.out.println("My salary is " + x);



    }

    @Override
    public void print() {
        System.out.println("My name is " + this.name );

    }
}
