package kata1;

import java.util.Date;

public class kata1 {

    public static void main(String[] args) {
        Person person = new Person("Blas", new Date(49,8,24));
        Person person1 = new Person("Christian", new Date(99,8,22));
        System.out.println(person.getName() + " tiene " + person.getAge());
        System.out.println(person1.getName() + " tiene " + person1.getAge());
    }
    
}
