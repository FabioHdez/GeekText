package RESTfulPanthers.GeekText.Repo;
import RESTfulPanthers.GeekText.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepo extends JpaRepository<Book, String> {

    // 	An administrator must be able to create a book
    // 	with the book ISBN, book name, book description,
    // 	price, author, genre, publisher ,
    // 	year published and copies sold.
    Book findByIsbn(String isbn);

    // Must be able to retrieve a book details by ISBN
    List <Book> findByInfo(String Info);
}
//Sprint 3: Just change the name of the interface from WishlistRepo to your interface name and also the type in JpaRepository<Wishlist
//from wishlist to your Model class name
