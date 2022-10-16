package RESTfulPanthers.GeekText.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("book")
public class BookController {

    @GetMapping(value = "/")

    public String getBookPage(HttpServletRequest request){
        String name = request.getParameter("name");
        if(name == null){
            return "Please input a book name";
        }
        return "Welcome to the book page. Now showing: "+name;
    }
}
