/**
 * Created by dima on 14.02.17.
 */
public class TestClass {

    public static void main (String[] args) {
            Person student = new Student("Olegik");
            Worker worker1 = new Cleaner("Petro", 900);
            Worker worker2 = new Teacher("Danila", 1220);

            student.print();
            worker1.print();
            worker1.salary(worker1.salary);
            worker2.print();
            worker2.salary(worker2.salary);
        }
    }
