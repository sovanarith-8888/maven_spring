package com.development.mavenspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebTitleController {

    @RequestMapping("/title")
    @ResponseBody
    public String webTitle(Model model){
        model.addAttribute("name", "Sovananrith");
        return "Web Title: The-Credential is loading";
    }

    @RequestMapping("/header")
    public String header(Model model, @RequestParam(value = "newName", defaultValue = "user-unknown") String newName ){
        model.addAttribute("name", "sovanarith");
        model.addAttribute("newName", newName);
        return "header";
    }

//  Path variale
    @RequestMapping("/path-variable/{name}")
    public String pathVar(Model model, @PathVariable("name") String name){
        model.addAttribute("name", name);
        return "header";
    }

}
