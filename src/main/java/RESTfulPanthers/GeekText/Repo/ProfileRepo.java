package RESTfulPanthers.GeekText.Repo;
import RESTfulPanthers.GeekText.Models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepo extends JpaRepository<Profile, String> {

}
//Sprint 3: Just change the name of the interface from WishlistRepo to your interface name and also the type in JpaRepository<Wishlist
//from wishlist to your Model class name
