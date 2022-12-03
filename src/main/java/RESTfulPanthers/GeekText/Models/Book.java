package RESTfulPanthers.GeekText.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity tells mySQL that this will be a table
@Entity
public class Book {
    //@Id tells mySQL that long id will be unique for each WishList
//@GenerateValue probably generates a random value idk...
    @Id
    private String isbn;
    //@Column tells mySQL that this will be a column in the database
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String price;
    @Column
    private String author;
    @Column
    private String genre;
    @Column
    private String publisher;
    @Column
    private String year;
    @Column
    private String sold;

    @Column
    private ArrayList<String> info;


    //Constructor
    public Book(String isbn, String name, String description, String price,
                String author, String genre, String publisher, String year, String sold ) {
        this.isbn = isbn;
        this.name = name;
        this.description = description;
        this.price = price;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.year = year;
        this.sold = sold;
    }

    public Book(){
        this.info = new ArrayList<String>();
    }



    //Getters and setters
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getName() {return name;}
    public void setTitle(String title) {
        this.name = name;
    }
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getPrice() {return price;}
    public void setPrice(String price) {this.price = price;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {this.genre = genre;}
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {this.publisher = publisher;}
    public String getYear() {
        return year;
    }
    public void setYear(String year) {this.year = year;}
    public String getSold() {
        return sold;
    }
    public void setSold(String sold) {this.sold = sold;}

    public List<String> getInfo() {return this.info;}
    public void addInfo(String newInfo) {this.info.add(newInfo);}

}
//Sprint 3: just play around with the variables that you need for your features make sure to update the constructor and the getters and setters