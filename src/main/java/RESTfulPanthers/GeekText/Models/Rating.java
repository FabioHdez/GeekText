package RESTfulPanthers.Models;

//Import to serialize an entire object using its single method
import com.fasterxml.jackson.annotation.JsonValue;

//Add star rating contents
public enum Rating {
    FIVE_STARS("⭐️⭐️⭐️⭐️⭐️️️️"),
    FOUR_STARS("⭐️⭐️⭐️⭐️"),
    THREE_STARS("⭐️⭐️⭐️"),
    TWO_STARS("⭐️⭐️"),
    ONE_STAR("⭐️");

    private String star;

    Rating(String star) {
        this.star = star;
    }
    
    //Serialize an object
    @JsonValue
    public String getStar() {
        return star;
    }
}
