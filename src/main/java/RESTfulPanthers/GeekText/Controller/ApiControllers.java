package RESTfulPanthers.GeekText.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ApiControllers {

    @GetMapping(value = "/")
//    @RequestMapping(value = "")
    public String getPage(HttpServletRequest request){
        String name = request.getParameter("name");
        if(name == null){
            name = "";
        }
        return "Welcome " + name;
    }
    @GetMapping(value = "/wishlist")

    public String getWishlistPage(HttpServletRequest request){
        String name = request.getParameter("name");
        if(name == null){
            return "Please input a wishlist name";
        }
        return "Welcome to the wish list page. Now showing your "+ name +" wish list";
    }
    @GetMapping(value = "/search")
    public String getSearchPage(HttpServletRequest request){
        String genre = request.getParameter("genre");
        if(genre == null){
            return "Please input a genre";
        }
        return "Welcome to the search page. Now showing: " + genre;
    }
    @GetMapping(value = "/book")

    public String getBookPage(HttpServletRequest request){
        String name = request.getParameter("name");
        if(name == null){
            return "Please input a book name";
        }
        return "Welcome to the book page. Now showing: "+name;
    }
    @GetMapping(value = "/profile")
    public String getProfilePage(HttpServletRequest request){
        String name = request.getParameter("name");
        if(name == null){
            return "Please input a name";
        }
        return "Hello "+name+". Welcome to the profile page";
    }
    @GetMapping(value = "/review")
    public String getReviewPage(HttpServletRequest request){
        String book = request.getParameter("book");
        if(book == null){
            return "Please input a book name";
        }
        return "Now reviewing Book: "+book+".";
    }

}
