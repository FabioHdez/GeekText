package RESTfulPanthers.GeekText.Repo;

import RESTfulPanthers.GeekText.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

    List <User> findByUsername(String username);

}
