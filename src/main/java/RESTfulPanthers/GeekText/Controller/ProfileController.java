package RESTfulPanthers.GeekText.Controller;

import RESTfulPanthers.GeekText.Models.Card;
import RESTfulPanthers.GeekText.Models.User;
import RESTfulPanthers.GeekText.Repo.CardRepo;
import RESTfulPanthers.GeekText.Repo.UserRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.velocity.exception.ResourceNotFoundException;
import java.util.List;

@RestController
@RequestMapping("users")

public class ProfileController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CardRepo cardRepo;

    @Autowired
    UserRepo lRepo;

    @GetMapping("/username")
    public ResponseEntity<List<User>> getUserByUsername(@RequestParam String username) {
        return new ResponseEntity<List<User>>(lRepo.findByUsername(username), HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public String saveUser( @RequestBody User user){
        userRepo.save(user);
        return "Saved!";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updateUser = userRepo.findById(id).get();
        updateUser.setHomeAddress(user.getHomeAddress());
        updateUser.setName(user.getName());
        updateUser.setPassword(user.getPassword());
        updateUser.setUsername(user.getUsername());
        userRepo.save(updateUser);
        return "Updated!";
    }

    @GetMapping("/{userID}/cards")
    public ResponseEntity<List<Card>> getAllCardsByUserId(@PathVariable(value = "userID") Long userId) {
        if (!userRepo.existsById(userId)) {
            throw new ResourceNotFoundException("Not found User with id = " + userId);
        }

        List<Card> cards = cardRepo.findByUserId(userId);
        return new ResponseEntity<>(cards, HttpStatus.OK);
    }

    @PostMapping("/{userID}/cards")
    public ResponseEntity<Card> createCard(@PathVariable(value = "userID") Long userID, @RequestBody Card cardRequest) {
        Card card = userRepo.findById(userID).map(user -> {
            cardRequest.setUser(user);
            return cardRepo.save(cardRequest);
        }).orElseThrow(() -> new ResourceNotFoundException("Not found User with id = " + userID));

        return new ResponseEntity<>(card, HttpStatus.CREATED);
    }

}
