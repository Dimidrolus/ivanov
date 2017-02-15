/**
 * Created by dima on 14.02.17.
 */
public class Student extends Person {

    private final PersonType PERSON_TYPE;

    Student(String name){

        super(name);

        PERSON_TYPE = PersonType.Student;
        System.out.println(PERSON_TYPE +" created");
    }

    @Override
    public void print() {
        System.out.println("My name is " + this.name);
    }
}
