package com.app.website.controller;

import com.app.website.model.PortfolioDetails;
import com.app.website.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/")
    public String home(Model model) {
        PortfolioDetails details = portfolioService.getPortfolioDetails("your-document-id").orElse(new PortfolioDetails());
        model.addAttribute("details", details);
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        PortfolioDetails details = portfolioService.getPortfolioDetails("your-document-id").orElse(new PortfolioDetails());
        model.addAttribute("details", details);
        return "about";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        PortfolioDetails details = portfolioService.getPortfolioDetails("your-document-id").orElse(new PortfolioDetails());
        model.addAttribute("details", details);
        return "projects";
    }

    @GetMapping("/certifications")
    public String certifications(Model model) {
        PortfolioDetails details = portfolioService.getPortfolioDetails("your-document-id").orElse(new PortfolioDetails());
        model.addAttribute("details", details);
        return "certifications";
    }

    @GetMapping("/social-media")
    public String socialMedia(Model model) {
        PortfolioDetails details = portfolioService.getPortfolioDetails("your-document-id").orElse(new PortfolioDetails());
        model.addAttribute("details", details);
        return "social-media";
    }

    @GetMapping("/achievements")
    public String achievements(Model model) {
        PortfolioDetails details = portfolioService.getPortfolioDetails("your-document-id").orElse(new PortfolioDetails());
        model.addAttribute("details", details);
        return "achievements";
    }

    @GetMapping("/love-it")
    public String loveIt(Model model) {
        PortfolioDetails details = portfolioService.getPortfolioDetails("your-document-id").orElse(new PortfolioDetails());
        model.addAttribute("details", details);
        return "love-it";
    }

    @GetMapping("/academics")
    public String academics(Model model) {
        PortfolioDetails details = portfolioService.getPortfolioDetails("your-document-id").orElse(new PortfolioDetails());
        model.addAttribute("details", details);
        return "academics";
    }
}
