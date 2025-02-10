package com.project.projectapi.repository;

import com.project.projectapi.model.WorkModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkRepository extends MongoRepository<WorkModel, String> {
}

