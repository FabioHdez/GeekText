package RESTfulPanthers.GeekText.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("wishlist")
public class WishlistController {

    @GetMapping(value = "/")
    public String getWishlistPage(HttpServletRequest request){
        String name = request.getParameter("name");
        if(name == null){
            return "Please input a wishlist name";
        }
        return "Welcome to the wish list page. Now showing your "+ name +" wish list";
    }
}
