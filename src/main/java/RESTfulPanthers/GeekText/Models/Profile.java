package RESTfulPanthers.GeekText.Models;

import javax.persistence.*;

//@Entity tells mySQL that this will be a table
@Entity
public class Profile {
    //@Id tells mySQL that long id will be unique for each Profile
//@GenerateValue probably generates a random value idk...
    @Id
    private String id;
    //@Column tells mySQL that this will be a column in the database
    @Column
    private String username;
//    @Column
//    private String password;
    @Column
    private String name;
//    @Column
//    private String emailAddress;
//    @Column
//    private String homeAddress;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//    public String getHomeAddress() {
//        return homeAddress;
//    }
//    public void setHomeAddress(String homeAddress) {
//        this.homeAddress = homeAddress;
//    }

//    public Profile(long id, String username, String name, String emailAddress, String homeAddress) {
//        this.id = id;
//        this.username = username;
//        this.name = name;
//        this.emailAddress = emailAddress;
//        this.homeAddress = homeAddress;
//    }

    public Profile(String id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }
}