package RESTfulPanthers.GeekText.Models;

import javax.persistence.*;

//@Entity tells mySQL that this will be a table
@Entity
public class Wishlist {
//@Id tells mySQL that long id will be unique for each WishList
//@GenerateValue probably generates a random value idk...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//@Column tells mySQL that this will be a column in the database
    @Column
    private String owner;
    @Column
    private String title;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
