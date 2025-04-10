package game.gamescrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Game {

    private long id;

    @Column(unique=true)
    private String title;

    private String description;

    public Game() {
    }

    public Game(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
