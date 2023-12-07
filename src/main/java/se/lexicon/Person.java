package se.lexicon;

public class Person {

    private int personId;

    private String firstName;

    private String lastName;

    public Person(String firstName, String lastName) {
        //this.personId = personId;
        setFirstName(firstName);
        setLastName(lastName);
        //this.firstName = firstName;
        //this.lastName = lastName;
        this.personId=generateId();

    }

    private static int idCounter = 100;

    private static int generateId(){
        return ++idCounter;
    }


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
