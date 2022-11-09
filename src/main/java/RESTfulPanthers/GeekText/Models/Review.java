package RESTfulPanthers.GeekText.Models;

import javax.persistence.*;

//@Entity tells mySQL that this will be a table
@Entity
public class Review {
    //@Id tells mySQL that long id will be unique for each WishList
//@GenerateValue probably generates a random value idk...
    @Id
    private String id;
    //@Column tells mySQL that this will be a column in the database
    @Column
    private String book;
    @Column
    private String rating;

    //Constructor
    public Review(String id, String book, String rating) {
        this.id = id;
        this.book = book;
        this.rating = rating;
    }

    //Getters and setters
    public void setId(String id) {
        this.id = id;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getBook() {
        return book;
    }

    public String getRating() {
        return rating;
    }
}
//Sprint 3: just play around with the variables that you need for your features make sure to update the constructor and the getters and setters