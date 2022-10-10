package RESTfulPanthers.GeekText.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

package com.frontbackend.thymeleaf.bootstrap.model.RatingSystem;

@RestController
@RequestMapping({"/", "/Api" })
public class ApiControllers {
    
    @GetMapping
    public String main(Model model) {
        model.addAttribute("ratingsystem", new RatingSystem());
        return "Api";
    }
    
    

    
