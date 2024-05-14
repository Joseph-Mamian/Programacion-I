package mycompany;

public class Person {
   String name; 
   String sex; 

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person() {
    }
    

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}


