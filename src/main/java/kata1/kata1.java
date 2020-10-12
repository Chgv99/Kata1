package kata1;

import java.time.LocalDate;

public class kata1 {
    
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1999, 8, 22);
        Person person = new Person("Christian", birthdate);
        
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}


