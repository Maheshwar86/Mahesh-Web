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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    public List<String> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<String> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }

    public List<String> getLoveIt() {
        return loveIt;
    }

    public void setLoveIt(List<String> loveIt) {
        this.loveIt = loveIt;
    }

    public List<String> getAcademics() {
        return academics;
    }

    public void setAcademics(List<String> academics) {
        this.academics = academics;
    }
    // Getters and Setters
}
