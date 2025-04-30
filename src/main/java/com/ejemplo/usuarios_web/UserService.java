package com.ejemplo.usuarios_web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public List<User> obtenerUsuarios() {
        return Arrays.asList(
            new User("Vivian", "Banshee", "lordphaethon@gmail.com"),
            new User("Lighter", "Lorenz", null),
            new User("Nicole", "Demara", "poor4ever@gmail.com")
        );
    }
}
