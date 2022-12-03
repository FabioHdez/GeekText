package RESTfulPanthers.GeekText.Controller;
import RESTfulPanthers.GeekText.Models.Book;
import RESTfulPanthers.GeekText.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
//import java.util.UUID;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @GetMapping(value = "/")
    @ResponseBody
    public Book getBookPage(HttpServletRequest request){
        // check the book ISBN
        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String author = request.getParameter("author");
        String genre = request.getParameter("genre");
        String publisher = request.getParameter("publisher");
        String year = request.getParameter("year");
        String sold = request.getParameter("sold");

        Book book = bookRepo.findbyBookDetails(isbn,name,description,price,
                author,genre,publisher,year,sold);
        if(book == null){
            return new Book(null,null,null,null,
                    null, null, null, null, null);
        }

        return book;
       // return new Book(isbn,name,description,price,author,genre,publisher,year,sold);
    }

    //must be able to create an author with first name, last name, biography and publisher


    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseEntity<String> saveBook(@RequestBody Book book){
        // Check if name is unique
        Book dbBook = bookRepo.findbyBookDetails(book.getIsbn(),book.getName(),book.getDescription(),book.getPrice(),
                book.getAuthor(), book.getGenre(), book.getPublisher(),
                book.getYear(), book.getSold());
        if (dbBook != null )
            return ResponseEntity.badRequest().body("Book details already exists for this user.");

        // Will run if name is unique
        bookRepo.save(book);
        return ResponseEntity.ok().body("Book details saved.");

      }

    @PostMapping(value = "/add")
    @ResponseBody
    public ResponseEntity<String> addDetails(HttpServletRequest request){
        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String author = request.getParameter("author");
        String genre = request.getParameter("genre");
        String publisher = request.getParameter("publisher");
        String year = request.getParameter("year");
        String sold = request.getParameter("sold");
        if(isbn == null){return ResponseEntity.badRequest().body("Please enter book details.");}
        Book bookDetails = bookRepo.findbyBookDetails(isbn, name, description, price,
                author, genre, publisher, year, sold);
        bookDetails.addInfo(isbn);
        bookRepo.save(bookDetails);
        return ResponseEntity.ok().body("Book details were added.");
    }

}
// Sprint 3: Here just change things from my feature and adjust it to your feature