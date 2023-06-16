package br.com.eljc.movies.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

public class Review {
    @Id
    private ObjectId id;
    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Review(ObjectId id, String body, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    public Review(String body, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    public Review() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
