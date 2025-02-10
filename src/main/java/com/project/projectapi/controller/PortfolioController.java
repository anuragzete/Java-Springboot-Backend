package com.project.projectapi.controller;

import com.project.projectapi.model.BlogsModel;
import com.project.projectapi.model.ProjectsModel;
import com.project.projectapi.model.WorkModel;
import com.project.projectapi.repository.BlogsRepository;
import com.project.projectapi.repository.ProjectsRepository;
import com.project.projectapi.repository.WorkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class PortfolioController {

    private final ProjectsRepository projectRepository;
    private final WorkRepository workRepository;
    private final BlogsRepository blogRepository;

    // Constructor Injection (Better than @Autowired field injection)
    public PortfolioController(ProjectsRepository projectRepository, WorkRepository workRepository, BlogsRepository blogRepository) {
        this.projectRepository = projectRepository;
        this.workRepository = workRepository;
        this.blogRepository = blogRepository;
    }

    // Fetch all projects
    @GetMapping("/projects")
    public List<ProjectsModel> getProjects() {
        return projectRepository.findAll();
    }

    // Fetch all work experiences
    @GetMapping("/work")
    public List<WorkModel> getWork() {
        return workRepository.findAll();
    }

    // Fetch all blog posts
    @GetMapping("/blogs")
    public List<BlogsModel> getBlogs() {
        return blogRepository.findAll();
    }

    // Fetch everything in a single request
    @GetMapping("/all")
    public PortfolioData getAllData() {
        return new PortfolioData(
                projectRepository.findAll(),
                workRepository.findAll(),
                blogRepository.findAll()
        );
    }

    // Inner static class to return all data at once
    static class PortfolioData {
        private final List<ProjectsModel> projects;
        private final List<WorkModel> work;
        private final List<BlogsModel> blogs;

        public PortfolioData(List<ProjectsModel> projects, List<WorkModel> work, List<BlogsModel> blogs) {
            this.projects = projects;
            this.work = work;
            this.blogs = blogs;
        }

        public List<ProjectsModel> getProjects() {
            return projects;
        }

        public List<WorkModel> getWork() {
            return work;
        }

        public List<BlogsModel> getBlogs() {
            return blogs;
        }
    }
}
