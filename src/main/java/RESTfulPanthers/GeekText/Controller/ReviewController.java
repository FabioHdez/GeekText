package RESTfulPanthers.GeekText.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("review")
@RestController
public class ReviewController {
    @GetMapping(value = "/")
    public String getReviewPage(HttpServletRequest request){
        String book = request.getParameter("book");
        if(book == null){
            return "Please input a book name";
        }
        return "Now reviewing Book: "+book+".";
    }
}

