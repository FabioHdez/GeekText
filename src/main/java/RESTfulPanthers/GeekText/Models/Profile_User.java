package com.alex.user.rest.Models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String emailAddress;

    @Column
    private String homeAddress;

    public Long getId(){
        return id;
    }

    public void setId( Long id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername( String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword( String password){
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public void setName( String name){
        this.name = name;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress( String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress(){
        return homeAddress;
    }

    public void setHomeAddress( String homeAddress){
        this.homeAddress = homeAddress;
    }

}
