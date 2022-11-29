package RESTfulPanthers.GeekText.Controller;
import RESTfulPanthers.GeekText.Models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("book")
public class BookController {

    @GetMapping(value = "/")
    @ResponseBody
    public Book getBookPage(HttpServletRequest request){
        // check the book ISBN
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String author = request.getParameter("author");
        String genre = request.getParameter("genre");
        String publisher = request.getParameter("publisher");
        String year = request.getParameter("year");
        String sold = request.getParameter("sold");


        return new Book(UUID.randomUUID().toString(),name,description,price,author,genre,publisher,year,sold);
    }
}
// Sprint 3: Here just change things from my feature and adjust it to your feature