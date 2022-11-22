// package RESTfulPanthers.GeekText.Controller;
// import RESTfulPanthers.GeekText.Models.Profile;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;

// import javax.servlet.http.HttpServletRequest;
// import java.util.UUID;

// @RestController
// @RequestMapping("profile")
// public class ProfileController {
//     @GetMapping(value = "/")
//     @ResponseBody
//     public Profile geProfilePage(HttpServletRequest request){
//         String name = request.getParameter("name");
//         String username = request.getParameter("username");
//         return new Profile(UUID.randomUUID().toString(),username,name);
//     }
// }

package com.alex.user.rest.Controller;

import com.alex.user.rest.Models.Card;
import com.alex.user.rest.Models.User;
import com.alex.user.rest.Repo.CardRepo;
import com.alex.user.rest.Repo.UserRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.velocity.exception.ResourceNotFoundException;
import java.util.List;

@RestController
public class APIController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CardRepo cardRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @Autowired
    UserRepo lRepo;

    @GetMapping("/users/username")
    public ResponseEntity<List<User>> getUserByUsername(@RequestParam String username) {
        return new ResponseEntity<List<User>>(lRepo.findByUsername(username), HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public String saveUser( @RequestBody User user){
        userRepo.save(user);
        return "Saved!";
    }

    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updateUser = userRepo.findById(id).get();
        updateUser.setHomeAddress(user.getHomeAddress());
        updateUser.setName(user.getName());
        updateUser.setPassword(user.getPassword());
        userRepo.save(updateUser);
        return "Updated!";
    }

    @GetMapping("/users/{userID}/cards")
    public ResponseEntity<List<Card>> getAllCardsByUserId(@PathVariable(value = "userID") Long userId) {
        if (!userRepo.existsById(userId)) {
            throw new ResourceNotFoundException("Not found User with id = " + userId);
        }

        List<Card> cards = cardRepo.findByUserId(userId);
        return new ResponseEntity<>(cards, HttpStatus.OK);
    }

    @PostMapping("/users/{userID}/cards")
    public ResponseEntity<Card> createCard(@PathVariable(value = "userID") Long userID, @RequestBody Card cardRequest) {
        Card card = userRepo.findById(userID).map(user -> {
            cardRequest.setUser(user);
            return cardRepo.save(cardRequest);
        }).orElseThrow(() -> new ResourceNotFoundException("Not found User with id = " + userID));

        return new ResponseEntity<>(card, HttpStatus.CREATED);
    }

}

