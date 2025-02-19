package com.app.website.controller;

import com.app.website.model.PortfolioDetails;
import com.app.website.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/save")
    public String savePortfolio(@RequestParam PortfolioDetails details) {
        portfolioService.savePortfolioDetails(details);
        return "redirect:/";
    }
}
