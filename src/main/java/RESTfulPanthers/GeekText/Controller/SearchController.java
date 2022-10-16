package RESTfulPanthers.GeekText.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "/")
    public String getSearchPage(HttpServletRequest request){
        String genre = request.getParameter("genre");
        if(genre == null){
            return "Please input a genre";
        }
        return "Welcome to the search page. Now showing: " + genre;
    }
}
