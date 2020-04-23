package nl.codeforall.hackaton.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class ChallengeDto {

    private Integer id;

    @NotNull(message = "should have a title")
    @NotBlank(message = "should have a title")
    @Size(min = 10, max = 64)
    private String title;

    @NotNull(message = "should have a description")
    @NotBlank(message = "should have a description")
    @Size(max = 420)
    private String description;


    private Date date;
    private Integer viewers = 0;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Integer getId() {
        return id;
    }
}
