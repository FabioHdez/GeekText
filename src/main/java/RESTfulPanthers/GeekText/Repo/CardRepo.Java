package RESTfulPanthers.GeekText.Repo;

import RESTfulPanthers.GeekText.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CardRepo extends JpaRepository<Card, Long> {

    List <Card> findByUserId(Long id);
}
