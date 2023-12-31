package com.practice.mongo.repositories;

import com.practice.mongo.models.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, String> {
}
