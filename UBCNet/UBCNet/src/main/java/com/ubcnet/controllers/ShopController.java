package com.ubcnet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping("/shop")
    public String shopPage(Model model) {
        model.addAttribute("title", "Shop");
        return "shop";
    }
}
