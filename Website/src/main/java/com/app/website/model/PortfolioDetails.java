package com.app.website.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "portfolioDetails")
public class PortfolioDetails {
    @Id
    private String id;
    private String logo;
    private String about;
    private List<String> projects;
    private List<String> certifications;
    private List<String> socialMedia;
    private List<String> achievements;
    private List<String> loveIt;
    private List<String> academics;

    // Getters and Setters
}
