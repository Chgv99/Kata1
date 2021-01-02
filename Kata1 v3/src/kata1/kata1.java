package kata1;

import java.time.LocalDate;
import java.time.Month;

public class kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, Month.AUGUST, 22);
        Person person = new Person("Christian", date);
        LocalDate date1 = LocalDate.of(2002, Month.JANUARY, 03);
        Person person1 = new Person("Rubén", date1);
        
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
        System.out.println(person1.getName() + " tiene " + person1.getAge() + " años");
    }
    
}
