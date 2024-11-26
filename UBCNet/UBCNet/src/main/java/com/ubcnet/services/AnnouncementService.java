package com.ubcnet.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnnouncementService {

    private List<String> announcements = new ArrayList<>();

    // Add a new announcement
    public void addAnnouncement(String title, String message) {
        announcements.add("Title: " + title + ", Message: " + message);
    }

    // Get all announcements
    public List<String> getAnnouncements() {
        return announcements;
    }
}
