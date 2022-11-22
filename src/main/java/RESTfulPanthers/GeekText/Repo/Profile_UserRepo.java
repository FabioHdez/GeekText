package com.alex.user.rest.Repo;

import com.alex.user.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

    List <User> findByUsername(String username);

}
