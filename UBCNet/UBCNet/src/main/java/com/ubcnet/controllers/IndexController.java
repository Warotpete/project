package com.ubcnet.controllers;

import com.ubcnet.services.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/")
    public String indexPage(Model model) {
        // Pass the list of announcements to the model
        model.addAttribute("announcements", announcementService.getAnnouncements());
        return "index"; // Serve the index.html template
    }
}
