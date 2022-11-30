package RESTfulPanthers.GeekText.Controller;
import RESTfulPanthers.GeekText.Models.Wishlist;
import RESTfulPanthers.GeekText.Repo.WishlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public Wishlist getWishlist(HttpServletRequest request){
        String title = request.getParameter("title");
        String user = request.getParameter("user");

        Wishlist wishlist = wishlistRepo.findByTitleAndUser(title,user);
        if(wishlist == null){
            return new Wishlist(null,null,null);
        }
        return wishlist;

    }
    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseEntity<String> saveWishlist(@RequestBody Wishlist wishlist){
        // Check if name is unique
        Wishlist dbWishlist = wishlistRepo.findByTitleAndUser(wishlist.getTitle(), wishlist.getUser());
        if (dbWishlist != null )
            return ResponseEntity.badRequest().body("Title already exists for this user.");

        // Will run if name is unique
        wishlist.setId(UUID.randomUUID().toString());
        wishlistRepo.save(wishlist);
        return ResponseEntity.ok().body("Wishlist saved.");
    }

    @PostMapping(value = "/add")
    @ResponseBody
    public ResponseEntity<String> addBook(HttpServletRequest request){
        String title = request.getParameter("title");
        String user = request.getParameter("user");
        String book = request.getParameter("book");
        if(book == null){return ResponseEntity.badRequest().body("Please enter book name.");}
        Wishlist wishlist = wishlistRepo.findByTitleAndUser(title,user);
        wishlist.addBook(book);
        wishlistRepo.save(wishlist);
        return ResponseEntity.ok().body("Book was added.");
    }
    @PostMapping(value = "/checkout")
    @ResponseBody
    public ResponseEntity<String> removeBook(HttpServletRequest request){
        String title = request.getParameter("title");
        String user = request.getParameter("user");
        String book = request.getParameter("book");
        if(book == null){return ResponseEntity.badRequest().body("Please enter book name.");}
        
        Wishlist wishlist = wishlistRepo.findByTitleAndUser(title,user);
        wishlist.removeBook(book);
        wishlistRepo.save(wishlist);
        return ResponseEntity.ok().body("Book was added to cart.");
    }
}
