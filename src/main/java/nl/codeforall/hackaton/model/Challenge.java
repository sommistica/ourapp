package nl.codeforall.hackaton.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "challenge")
public class Challenge extends AbstractModel {

    private String title;
    private String description;
    private Date date;
    private Integer viewers = 0;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void incrementViewers() {
        viewers++;
    }

    public void decrementViewers() {
        viewers--;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Integer getViewers() {
        return viewers;
    }
}
