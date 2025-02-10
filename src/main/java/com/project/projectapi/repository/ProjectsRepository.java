package com.project.projectapi.repository;

import com.project.projectapi.model.ProjectsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectsRepository extends MongoRepository<ProjectsModel, String> {
}
