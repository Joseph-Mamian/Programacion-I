package mycompany;

public class MyCompany {

    public static void main(String[] args) {
        String name = "Alfredo";
        String sex = "M";
        
        Person person = new Person(name, sex); 
        
        PersonService personService = new PersonService();
        boolean check = personService.checkFemale(person);
        System.out.println("check = " + check);
    }
    
}
