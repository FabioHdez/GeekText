package RESTfulPanthers.GeekText.Controller;
import RESTfulPanthers.GeekText.Models.Search;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "/")
    @ResponseBody
    public Search geProfilePage(HttpServletRequest request){
        String genre = request.getParameter("genre");
        String name = request.getParameter("name");
        return new Search(UUID.randomUUID().toString(),genre,name);
    }
}
