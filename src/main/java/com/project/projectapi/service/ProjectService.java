package com.project.projectapi.service;

import com.project.projectapi.model.ProjectsModel;
import com.project.projectapi.repository.ProjectsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectsRepository projectRepository;

    public ProjectService(ProjectsRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectsModel> getAllProjects() {
        return projectRepository.findAll();
    }
}
