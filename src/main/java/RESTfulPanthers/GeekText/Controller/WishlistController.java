package RESTfulPanthers.GeekText.Controller;
import RESTfulPanthers.GeekText.Models.Wishlist;
import RESTfulPanthers.GeekText.Repo.WishlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("wishlist")
public class WishlistController {

    @Autowired
    private WishlistRepo wishlistRepo;
    @GetMapping(value = "/")
    @ResponseBody
    public Wishlist getWishlistPage(HttpServletRequest request){
        String user = request.getParameter("user");
        String name = request.getParameter("name");
        return new Wishlist(UUID.randomUUID().toString(),user,name);
    }
    @PostMapping(value = "/create")
    @ResponseBody
    public Wishlist createWishlistPage(@RequestBody Wishlist wishlist){
        // run logic to verify if name is unique and then save to database
        return wishlist;
    }
}
// Sprint 3: Here just change things from my feature and adjust it to your feature