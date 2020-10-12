package kata1;
import java.time.Period;
import java.time.LocalDate;
public class Person {
    
    private final String name;
    private final LocalDate birth;
    private final LocalDate actual_date = LocalDate.now();

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birth = birthdate;
    }
    
    public LocalDate getBirthdate() {
        return birth;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge(){
        return Period.between(birth, actual_date).getYears();
        
    }
}
