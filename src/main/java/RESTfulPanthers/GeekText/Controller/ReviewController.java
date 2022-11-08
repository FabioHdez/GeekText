package RESTfulPanthers.GeekText.Controller;
import RESTfulPanthers.GeekText.Models.Profile;
import RESTfulPanthers.GeekText.Models.Review;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RequestMapping("review")
@RestController
public class ReviewController {
    @GetMapping(value = "/")
    @ResponseBody
    public Review geReviewPage(HttpServletRequest request){
        String book = request.getParameter("book");
        String rating = request.getParameter("rating");
        return new Review(UUID.randomUUID().toString(),book,rating);
    }
}

