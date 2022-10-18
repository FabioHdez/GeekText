package RESTfulPanthers.GeekText.Controller;
import RESTfulPanthers.GeekText.Models.Wishlist;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("wishlist")
public class WishlistController {

    @GetMapping(value = "/")
    @ResponseBody
    public Wishlist getWishlistPage(HttpServletRequest request){
        String user = request.getParameter("user");
        String name = request.getParameter("name");
        return new Wishlist(UUID.randomUUID().toString(),user,name);
    }
}
// Sprint 3: Here just change things from my feature and adjust it to your feature