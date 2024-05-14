package mycompany;

public class PersonService {
    public static final String FEMALE = "F";
    public static final String MALE = "M";
    
    public boolean checkFemale(Person person){
     return person.getSex().equalsIgnoreCase(PersonService.FEMALE);
    }
}
