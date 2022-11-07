package RESTfulPanthers.Models;

//Record type to create classes
public record Book(Integer id, String title, User user, Rating rating, String comment, String date) {

}
