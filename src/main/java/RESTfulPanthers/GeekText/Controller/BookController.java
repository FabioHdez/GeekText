package Controllers;

import Models.Book;
import Repositories.BookRepository;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @SchemaMapping(typeName = "Query",value = "allBooks")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
