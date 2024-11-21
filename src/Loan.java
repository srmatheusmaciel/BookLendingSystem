import java.time.LocalDate;
import java.time.LocalDateTime;

public class Loan {
    private int id;
    private Book book_id;
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;
    private User username;

    public Loan(int id, Book book_id, User username) {
        this.id = id;
        this.book_id = book_id;
        this.loanDate = LocalDateTime.now();
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook_id() {
        return book_id;
    }

    public void setBook_id(Book book_id) {
        this.book_id = book_id;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", book_id=" + book_id +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                ", username='" + username + '\'' +
                '}';
    }
}
