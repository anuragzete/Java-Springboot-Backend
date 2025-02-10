package com.project.projectapi.repository;

import com.project.projectapi.model.BlogsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogsRepository extends MongoRepository<BlogsModel, String> {
}
