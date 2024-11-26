package com.ubcnet.controllers;

import com.ubcnet.services.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/post")
    public String postPage() {
        return "post";
    }

    @PostMapping("/create-post")
    public String createPost(
            @RequestParam("postType") String postType,
            @RequestParam("title") String title,
            @RequestParam(value = "message", required = false) String message,
            Model model
    ) {
        if (postType.equals("announcement")) {
            // Add new announcement via the service
            announcementService.addAnnouncement(title, message);
        }

        // Redirect back to the index page
        return "redirect:/";
    }
}
