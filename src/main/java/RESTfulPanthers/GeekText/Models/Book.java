package RESTfulPanthers.GeekText.Models;

import javax.persistence.*;

//@Entity tells mySQL that this will be a table
@Entity
public class Book {
    //@Id tells mySQL that long id will be unique for each WishList
//@GenerateValue probably generates a random value idk...
    @Id
    private String id;
    //@Column tells mySQL that this will be a column in the database
    @Column
    private String title;
    @Column
    private String genre;

    //Constructor
    public Book(String id, String title, String genre) {
        this.id = id;
        this.genre = genre;
        this.title = title;
    }

    //Getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
//Sprint 3: just play around with the variables that you need for your features make sure to update the constructor and the getters and setters