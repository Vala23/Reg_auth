package com.peshkovava.reg_authentication.controller;

import com.peshkovava.reg_authentication.model.User;
import com.peshkovava.reg_authentication.service.RegistrationService;
import com.peshkovava.reg_authentication.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    private final RegistrationService registrationService;
    private final RoleService roleService;

    @Autowired
    public RegistrationController(RegistrationService registrationService, RoleService roleService) {
        this.registrationService = registrationService;
        this.roleService = roleService;
    }

    @GetMapping
    public String regPage(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("roles", roleService.getAllRole());
        return "registration";
    }

    @PostMapping
    public String formReg(@ModelAttribute("user") User user) {
        registrationService.register(user);
        return "redirect:/login";
    }
}
