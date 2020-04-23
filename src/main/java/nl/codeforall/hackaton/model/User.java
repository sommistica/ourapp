package nl.codeforall.hackaton.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends AbstractModel {


    private String username;
    private String password;
    private String email;
    private Integer score = 0;

    @OneToMany(
             cascade = {CascadeType.ALL},

            mappedBy = "customer",

            fetch = FetchType.EAGER
    )
    private List<Challenge> challenges = new ArrayList<>();

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setScore(Integer score) {
        this.score = score;
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

    public Integer getScore() {
        return score;
    }
}
