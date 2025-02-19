package com.app.website.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.app.website.model.PortfolioDetails;

public interface PortfolioDetailsRepository extends MongoRepository<PortfolioDetails, String> {
}
