package RESTfulPanthers.GeekText.Repo;
import RESTfulPanthers.GeekText.Models.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepo extends JpaRepository<Wishlist, Long> {

}
//Sprint 3: Just change the name of the interface from WishlistRepo to your interface name and also the type in JpaRepository<Wishlist
//from wishlist to your Model class name
