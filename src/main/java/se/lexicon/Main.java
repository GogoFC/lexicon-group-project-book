package se.lexicon;

public class Main {
    public static void main(String[] args) {


        try {
            //Book someBook = new Book("go","a",);
            Book anotherBook = new Book("Title Book 1","book");
            Book newBook = new Book("Book 33","Author");

            Person newPerson = new Person("Michael","Jordan");
            Person Jackie = new Person("Jackie","M");

            newPerson.loanBook(anotherBook);
//            Jackie.loanBook(anotherBook);
            newPerson.loanBook(newBook);

            System.out.println(newPerson.displayBooks());
//        System.out.println(newPerson.getFirstName());

            System.out.println(anotherBook.showPerson());
        } catch (IllegalAccessException il) {
            System.out.println(il.getMessage());
        }


    }
}