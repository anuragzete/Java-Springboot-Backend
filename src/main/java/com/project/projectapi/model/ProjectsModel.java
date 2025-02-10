package com.project.projectapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "projects")
public class ProjectsModel {
    @Id
    private String id;
    private String title;
    private String description;
    private String image;
    private String github;
    private String live;
    private List<String> tags;

    // Constructors
    public ProjectsModel() {}

    public ProjectsModel(String title, String description, String image, String github, String live, List<String> tags) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.github = github;
        this.live = live;
        this.tags = tags;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }

    public String getLive() { return live; }
    public void setLive(String live) { this.live = live; }

    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }
}
