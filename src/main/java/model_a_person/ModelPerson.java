package model_a_person;

public class ModelPerson {

    public static void main(String[] args){

        Person p1 = new Person("Adamu", "Richards", 23);
        Person p2 = new Person("Michael", "Engrin", 27);
        Person p3 = new Person("Gabriel", "Osub", 24);

        p1.introduceYourself();
        p2.introduceYourself();
        p3.introduceYourself();
        p3.setAge(21);
    }
}
