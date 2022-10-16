package RESTfulPanthers.GeekText.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("profile")
public class ProfileController {
    @GetMapping(value = "/")
    public String getProfilePage(HttpServletRequest request){
        String name = request.getParameter("name");
        if(name == null){
            return "Please input a name";
        }
        return "Hello "+name+". Welcome to the profile page";
    }
}
