package com.ejemplo.usuarios_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @Autowired 
    private UserService userService;

    @GetMapping("/usuarios")
    public String mostarUsuarios(Model model) {
        model.addAttribute("usuarios", userService.obtenerUsuarios());
        return "usuarios";
    }

}
