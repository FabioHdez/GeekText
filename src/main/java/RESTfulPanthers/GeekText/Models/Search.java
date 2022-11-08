package RESTfulPanthers.GeekText.Models;

import javax.persistence.*;

//@Entity tells mySQL that this will be a table
@Entity
public class Search {
    //@Id tells mySQL that long id will be unique for each WishList
//@GenerateValue probably generates a random value idk...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    //@Column tells mySQL that this will be a column in the database
    @Column
    private String genre;
    @Column
    private String name;

    //Constructor
    public Search(String id, String genre, String name) {
        this.id = id;
        this.genre = genre;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }
}
//Sprint 3: just play around with the variables that you need for your features make sure to update the constructor and the getters and setters