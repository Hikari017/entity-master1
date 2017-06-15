package japonics.newspring.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Justyna on 13.06.2017.
 */
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String message;
    private int id;
    private String author;

    public Ticket(String message,  String author) {
        this.message = message;
        this.author = author;
    }

    public Ticket() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}