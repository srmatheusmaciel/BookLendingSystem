import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void makeLoan(int bookId, User user) {
        Book book = findBookById(bookId);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            Loan loan = new Loan(loans.size() + 1, book, user);
            loans.add(loan);
            System.out.println("Loan made successfully!" + loan);
        } else {
            System.out.println("Book not found or not available.");
        }
    }

    public void returnBook(int loanId) {
        Loan loan = findLoanById(loanId);
        if (loan != null) {
            loan.getBook_id().setAvailable(true);
            loan.setReturnDate(LocalDateTime.now());
            System.out.println("Book " + loan + "returned successfully!");
        } else {
            System.out.println("Loan not found.");
        }


    }

    private Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

    private Loan findLoanById(int loanId) {
        for (Loan loan : loans) {
            if (loan.getId() == loanId) {
                return loan;
            }
        }
        return null;
    }

}



