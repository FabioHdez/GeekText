package RESTfulPanthers.Controllers;

//Import necessary packages and features
import Models.Book;
import Repositories.BookRepository;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

//Form an ordered collection
import java.util.List;
@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //Maps a handler method to a field in the GraphQL schema
    @SchemaMapping(typeName = "Query",value = "allBooks")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
