package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    private int personId;

    private String firstName;

    private String lastName;

    private ArrayList<Book> leasedBooks;

    public Person(String firstName, String lastName) {
        //this.personId = personId;
        setFirstName(firstName);
        setLastName(lastName);
        //this.firstName = firstName;
        //this.lastName = lastName;
        //this.personId=generateId();
        this.personId=this.generateId();
        this.leasedBooks = new ArrayList<>();

    }

    public void loanBook(Book newone) throws IllegalAccessException {
        if (!newone.isAvailable())
            throw new IllegalAccessException(newone.getTitle() + " Not available");
        newone.setLoaner(this);
        newone.setAvailable(false);
        this.leasedBooks.add(newone);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("personId=").append(personId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        for (Book item : leasedBooks) {
            sb.append("\t");
            sb.append(item.getTitle());
        }
        sb.append('}');
        return sb.toString();
    }

    public String displayBooks() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("leasedBooks=");
        for (Book item : leasedBooks) {
            sb.append("\n");
            sb.append(item.getTitle());
        }

        sb.append('}');
        return sb.toString();

    }

    private static int idCounter = 100;

    private int generateId(){
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
        if (firstName.isBlank()) throw new IllegalArgumentException("Enter First Name");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.isBlank()) throw new IllegalArgumentException("Enter Last Name");
        this.lastName = lastName;
    }


}
