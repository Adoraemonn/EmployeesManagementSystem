package com.example.backend.ems.employee.management.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FrontendController {

    @GetMapping(value = {"/", "/{path:^(?!api$).*$}", "/**/{path:^(?!api$).*$}"})
    public String forward(@PathVariable String path) {
        return "forward:/index.html";
    }
}

