package RESTfulPanthers.GeekText.Controller;
import RESTfulPanthers.GeekText.Models.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("profile")
public class ProfileController {
    @GetMapping(value = "/")
    @ResponseBody
    public Profile geProfilePage(HttpServletRequest request){
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        return new Profile(UUID.randomUUID().toString(),username,name);
    }
}
