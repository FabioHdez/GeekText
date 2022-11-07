package RESTfulPanthers.Repositories;

//Import necessary packages and features
import Models.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//Allows accessed data from a connected database
@Repository
public class UserRepository {

    //Store strings
    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }
    
    //Return data based on user's ID
    public User findById(int id) {
        return users.stream()
                .filter(user -> user.id() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    //Return data based on user's name
    public User findByName(String name) {
        return users.stream()
                .filter(user -> user.fullName().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    //Being executed after the spring bean is initialized
    @PostConstruct
    
    //Store user's ID and name
    private void init() {
        users.add(new User(1,"Morgan Love"));
        users.add(new User(2,"Ezra Russell"));
        users.add(new User(3,"Tobias Johns"));
        users.add(new User(4,"Ezra Russell"));
        users.add(new User(5,"Tobias Johns"));
    }
}
