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
        String genre = request.getParameter("genre");
        String title = request.getParameter("title");
        return new Book(UUID.randomUUID().toString(),title,genre);
    }
}
// Sprint 3: Here just change things from my feature and adjust it to your feature