package RESTfulPanthers.GeekText.Repo;
import RESTfulPanthers.GeekText.Models.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepo extends JpaRepository<Wishlist, String> {
    Wishlist findByTitleAndUser (String title,String user);
}

