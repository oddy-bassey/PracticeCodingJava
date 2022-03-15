package model_a_person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age < this.age){
            System.out.println("You can't make a person younger! New age not set.");
        }else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void introduceYourself(){
        System.out.println("Hi, my name is "+getLastName()+" "+getFirstName()+" and I'm "+getAge()+" years old");
    }
}
