package nl.codeforall.hackaton.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "challenge")
public class Challenge extends AbstractModel {

    private String title;
    private String description;
    private String date;
    private Integer viewers = 0;

    @ManyToOne
    private User user;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void incrementViewers() {
        viewers++;
    }

    public void decrementViewers() {
        viewers--;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public Integer getViewers() {
        return viewers;
    }

    public User getUser() {
        return user;
    }
}

