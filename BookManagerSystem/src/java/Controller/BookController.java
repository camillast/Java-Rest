package Controller;

import DAO.BookManager;
import Model.Book;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Camilla
 */
@Named(value = "bookController")
@RequestScoped
public class BookController {

    @Inject BookManager pm;
    
    private String name;
    private String description;
    private Double price;
    private List<Book>allBooks;
    
    public void submit() {
       Book b = new Book(name, description, price);
       pm.addBook(b);
       allBooks = pm.getAllBooks();
    }
    public BookController() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(List<Book> allBooks) {
        this.allBooks = allBooks;
    }
    
    
}
