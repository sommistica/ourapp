package nl.codeforall.hackaton.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends AbstractModel {


    private String username;
    private String password;
    private String email;



    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
