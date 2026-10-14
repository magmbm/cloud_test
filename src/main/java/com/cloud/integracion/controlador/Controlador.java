package com.cloud.integracion.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/api")
class Controlador {

    @GetMapping ("/health")
    public String health() {
        return "API funcional test\n";
    }

}