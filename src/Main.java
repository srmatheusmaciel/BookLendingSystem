//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Create a new user
        User user1 = new User("Matheus Maciel", 1);
        User user2 = new User("Miliane Maciel", 2);

        //Create a new book
        Book book1 = new Book(1, "Clean Code", "Robert C. Martin", 78.90, true);
        Book book2 = new Book(2, "Design Patterns", "Erich Gamma", 375.68, true);

        //Create a new library
        Library library = new Library();

        //Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        //List available books
        System.out.println("------------- WELCOME TO THE LIBRARY -------------");
        System.out.println("Available books: ");
        library.listAvailableBooks();


        System.out.println("------------- LOANS -------------");
        //Make a loan
        library.makeLoan(1, user1);
        library.makeLoan(2, user2);

        //List available books
        System.out.println("Available books after loan: ");
        library.listAvailableBooks();



        System.out.println("------------- RETURNS -------------");
        //Return a loan
        library.returnBook(1);
        library.returnBook(2);

        //List available books
        System.out.println("Available books after return: ");
        library.listAvailableBooks();





    }
}