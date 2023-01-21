package com.example.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // Need a Controller method to show initial html form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // Need a Controller method to process the html form
    @RequestMapping("processForm")
    public String processForm() {
        return "helloworld";
    }

    // Need a Controller method to read form data
    // and add data to the model
    @RequestMapping("processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // read the request parameter from HTML form
        String name = request.getParameter("studentName");

        // Convert the data to all uppercase letter
        String updatedName = name.toUpperCase();

        // Create the message
        String result = "Yo! " + updatedName;

        // Add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
