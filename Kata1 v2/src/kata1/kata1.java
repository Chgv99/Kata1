package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1999,8,22);
        
        Person person = new Person("Christian", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
