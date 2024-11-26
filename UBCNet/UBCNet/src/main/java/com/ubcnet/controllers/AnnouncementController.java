package com.ubcnet.controllers;

import com.ubcnet.services.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/announcements")
    public String announcementsPage(Model model) {
        // Pass announcements from the service to the page
        model.addAttribute("title", "Announcements");
        model.addAttribute("announcements", announcementService.getAnnouncements());
        return "announcements";
    }
}
