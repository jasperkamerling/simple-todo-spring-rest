package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

@Entity
public final class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String url;
    private Boolean completed;
    private Integer ordering;

    public Todo(UUID id, String title, String url, boolean completed, int ordering) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.completed = completed;
        this.ordering = ordering;
    }

    public Todo() {

    }


    public UUID id() {
        return id;
    }

    public String title() {
        return title;
    }

    public String url() {
        return url;
    }

    public boolean completed() {
        return completed;
    }

    public int order() {
        return ordering;
    }

    public Todo withId(UUID id) {
        return new Todo(id, title(), url(), completed(), order());
    }

    public Todo withTitle(String title) {
        return new Todo(id(), title, url(), completed(), order());
    }

    public Todo withCompleted(boolean completed) {
        return new Todo(id(), title(), url(), completed, order());
    }

    public Todo withOrder(int order) {
        return new Todo(id(), title(), url(), completed(), order);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Todo)) {
            return false;
        }
        Todo other = (Todo)obj;
        return Objects.equals(id, other.id) &&
                Objects.equals(title, other.title) &&
                Objects.equals(url, other.url) &&
                completed == other.completed &&
                ordering == other.ordering;
    }

    public int hashCode() {
        return Objects.hash(id, title, url, completed, ordering);
    }

    public String toString() {
        return "Todo: [id=" + id + ", title=" + title + ", url=" + url + ", completed=" + completed + ", ordering=" + ordering + "]";
    }
}
