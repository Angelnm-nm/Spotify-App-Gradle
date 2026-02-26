package edu.iesam.features.songs.domain;

public class Song {

    private String id;
    private String title;
    private String author;
    private String duration;


    public Song(String duration, String author, String title, String id) {
        this.duration = duration;
        this.author = author;
        this.title = title;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
