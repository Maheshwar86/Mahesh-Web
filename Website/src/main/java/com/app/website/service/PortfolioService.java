package com.app.website.service;

import com.app.website.model.PortfolioDetails;
import com.app.website.repository.PortfolioDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioDetailsRepository repository;

    public Optional<PortfolioDetails> getPortfolioDetails(String id) {
        return repository.findById(id);
    }

    public PortfolioDetails savePortfolioDetails(PortfolioDetails details) {
        return repository.save(details);
    }

    // Additional service methods if needed
}
