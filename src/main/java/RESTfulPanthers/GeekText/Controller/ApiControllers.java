package RESTfulPanthers.GeekText.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ApiControllers {

    @GetMapping(value = "/")
    public String getPage(HttpServletRequest request){
        String name = request.getParameter("name");
        if(name == null){
            name = "";
        }
        return "Welcome " + name;
    }
}
