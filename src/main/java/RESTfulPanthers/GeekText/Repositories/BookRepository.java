package RESTfulPanthers.Repositories;

//Import necessary packages and features
import Models.Book;
import Models.Rating;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//Allows accessed data from a connected database
@Repository
public class BookRepository {

    private final UserRepository userRepository;
    
    //Store strings
    private List<Book> books = new ArrayList<>();

    public BookRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    //Find all books
    public List<Book> findAllBooks() {
        return books;
    }
    
    //Find a book
    public Book findBook(Integer id) {
        return books.stream()
                .filter(book -> book.id() == id)
                .findFirst().orElseThrow(() -> new RuntimeException("Book not found"));
    }
    
    //Being executed after the spring bean is initialized
    @PostConstruct
    
    //Store and fill the database
    private void init() {
        books.add(new Book(1,
                "Book Genre #1",
                userRepository.findByName("Morgan Love"),
                 Rating.FIVE_STARS,
                "Top-tier quality book.",
                    "2022-09-04"));
        books.add(new Book(2,
                "Book Genre #2",
                userRepository.findByName("Ezra Russell"),
                Rating.FOUR_STARS,
                "An overall enjoyable ride from the beginning to the end",
                "2022-03-23"));
        books.add(new Book(3,
                "Book Genre #3",
                userRepository.findByName("Tobia Johns"),
                Rating.FIVE_STARS,
                "One of the best book I've ever read",
            "2022-05-02"));
        books.add(new Book(4,
                "Book Genre #4",
                userRepository.findByName("Tara Moran"),
                Rating.THREE_STARS,
                "Inconsistent Plotholes somewhat decreases the book's quality, but it's still a decent book regardless",
            "2022-07-13"));
        books.add(new Book(5,
                "Book Genre #5",
                userRepository.findByName("James Clements"),
                Rating.TWO_STARS,
                "A boring book, no reason to continue on to the conclusion.",
                "2022-10-01"));
    }
    }
