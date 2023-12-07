package se.lexicon;

public class Book {

    private String title;

    private String author;

    private boolean available;

    private Person loaner;


    public String getTitle() {
        return title;
    }


    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        //this.title = title;
        //this.author = author;
        setAvailable(true);
    }

    public void setLoaner(Person loaner) {
        this.loaner = loaner;
    }

    public String showPerson(){
        return loaner.toString();
        //return loaner;

    }

    public void setTitle(String title) {
        if (title.isBlank()) throw new IllegalArgumentException("Enter Book Name");
        this.title = title;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {
        if (author.isBlank()) throw new IllegalArgumentException("Enter Book name");
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
