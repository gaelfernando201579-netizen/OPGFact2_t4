package com.ito.OPGFact2_t4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {

    // Regresa info del proyecto mediante una vista HTML
    @GetMapping("/mi-proyecto")
    public String obtenerInfoProyecto(Model model) {
        model.addAttribute("titulo", "Proyecto de Gael Fernando Ortiz Pérez");
        model.addAttribute("instancia", "OPGFact2_t4");
        return "mi-proyecto";
    }

    // Muestra el status del servidor
    @GetMapping("/status")
    public String obtenerStatus(Model model) {
        model.addAttribute("estado", "Galo-Server esta ejecutandose correctamente");
        return "status";
    }
}