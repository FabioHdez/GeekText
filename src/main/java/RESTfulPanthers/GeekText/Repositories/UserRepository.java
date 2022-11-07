package Repositories;

import Models.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        return users.stream()
                .filter(user -> user.id() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User findByName(String name) {
        return users.stream()
                .filter(user -> user.fullName().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @PostConstruct
    private void init() {
        users.add(new User(1,"Morgan Love"));
        users.add(new User(2,"Ezra Russell"));
        users.add(new User(3,"Tobias Johns"));
        users.add(new User(4,"Ezra Russell"));
        users.add(new User(5,"Tobias Johns"));
    }
}
