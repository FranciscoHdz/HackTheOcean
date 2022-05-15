package com.example.droneform;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String user;
    private String email;

    public Long getId(){ return id;}
    public String getName() { return name;}
    public String getUser() { return user;}
    public String getEmail() {  return email;}

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUser(String user) { this.user = user; }
    public void setEmail(String email) { this.email = email; }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                ", email= " + email + '\'' +
                '}';
    }
}
