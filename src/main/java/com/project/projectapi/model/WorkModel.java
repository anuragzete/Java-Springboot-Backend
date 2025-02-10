package com.project.projectapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "work")
public class WorkModel {
    @Id
    private String id;
    private String title;
    private String company;
    private String location;
    private String duration;
    private List<String> description;
    private String companyUrl;
    private List<String> technologies;

    // Constructors
    public WorkModel() {}

    public WorkModel(String title, String company, String location, String duration, List<String> description, String companyUrl, List<String> technologies) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.duration = duration;
        this.description = description;
        this.companyUrl = companyUrl;
        this.technologies = technologies;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public List<String> getDescription() { return description; }
    public void setDescription(List<String> description) { this.description = description; }

    public String getCompanyUrl() { return companyUrl; }
    public void setCompanyUrl(String companyUrl) { this.companyUrl = companyUrl; }

    public List<String> getTechnologies() { return technologies; }
    public void setTechnologies(List<String> technologies) { this.technologies = technologies; }
}
