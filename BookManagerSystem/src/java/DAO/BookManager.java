package DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import Model.Book;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Camilla
 */
@Stateless
public class BookManager {
    
    @PersistenceContext
    EntityManager em;
    
    public void addBook(Book b) {
        em.persist(b);
    }
    
    public List<Book>getAllBooks() {
      Query q = em.createQuery("SELECT b FROM Book b");
      return q.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
