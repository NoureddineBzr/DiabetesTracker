package org.example.controller;

import org.example.model.GlucoseReading;
import org.example.service.GlucoseReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class GlucoseReadingController {

    @Autowired
    private GlucoseReadingService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listReadings", service.getAllReadings());
        return "index";
    }

    @GetMapping("/showNewReadingForm")
    public String showNewReadingForm(Model model) {
        GlucoseReading reading = new GlucoseReading();
        model.addAttribute("reading", reading);
        return "new_reading";
    }

    @PostMapping("/saveReading")
    public String saveReading(@ModelAttribute("reading") GlucoseReading reading) {
        reading.setTimestamp(new Date());
        service.saveReading(reading);
        return "redirect:/";
    }

    @GetMapping("/deleteReading/{id}")
    public String deleteReading(@PathVariable(value = "id") Long id) {
        service.deleteReading(id);
        return "redirect:/";
    }
}
