package com.io.nwl.modules.usuarios.controller;

import com.io.nwl.modules.usuarios.model.User;
import com.io.nwl.modules.usuarios.service.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/DB-X")
public class ControllerUser {

    @Autowired
    ServiceUsuario service;
    @PostMapping
    public ResponseEntity create(@RequestBody User user) throws Exception {
        return ResponseEntity.ok().body(service.create(user));
    }
    @GetMapping
    public ResponseEntity get() throws Exception {
        return ResponseEntity.ok().body(service.find());
    }
}
