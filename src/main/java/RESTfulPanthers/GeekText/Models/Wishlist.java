package RESTfulPanthers.GeekText.Models;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Entity tells mySQL that this will be a table
@Entity

public class Wishlist {
//@Id tells mySQL that long id will be unique for each WishList
//@GenerateValue probably generates a random value idk...
    @Id
    private String id;
    //@Column tells mySQL that this will be a column in the database
    @Column
    private String user;
    @Column
    private String title;
    @Column
    private ArrayList<String> books;


    //Constructor

    public Wishlist(String id, String user, String title) {
        this.id = id;
        this.user = user;
        this.title = title;
    }
    public Wishlist(){
        this.books = new ArrayList<String>();
    }


    //Getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getBooks() {
        return this.books;
    }
    public void addBook(String newBook) {
        this.books.add(newBook);
    }
}
//Sprint 3: just play around with the variables that you need for your features make sure to update the constructor and the getters and setters