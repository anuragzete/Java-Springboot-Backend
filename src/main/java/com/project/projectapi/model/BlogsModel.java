package com.project.projectapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blogs")
public class BlogsModel {
    @Id
    private String id;
    private String title;
    private String excerpt;
    private String date;
    private String readTime;
    private String image;
    private String category;

    // Constructors
    public BlogsModel() {}

    public BlogsModel(String title, String excerpt, String date, String readTime, String image, String category) {
        this.title = title;
        this.excerpt = excerpt;
        this.date = date;
        this.readTime = readTime;
        this.image = image;
        this.category = category;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getExcerpt() { return excerpt; }
    public void setExcerpt(String excerpt) { this.excerpt = excerpt; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getReadTime() { return readTime; }
    public void setReadTime(String readTime) { this.readTime = readTime; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
