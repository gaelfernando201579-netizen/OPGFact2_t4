package com.ito.OPGFact2_t4.controllers;

import models.dto.MateriaDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/vistas")
public class MateriaController {

    @Value("${config.semestre}")
    private String semestre;

    private final List<MateriaDTO> materias = new ArrayList<>(Arrays.asList(
            new MateriaDTO("Administración de Redes", "Omar Robledo Cabrera"),
            new MateriaDTO("Simulación", null),
            new MateriaDTO("Taller de Investigación I", "Dalia Silva Martínez")));

    @ModelAttribute("materias")
    public List<MateriaDTO> listaMaterias() {
        return materias;
    }

    @GetMapping("/materias")
    public String listarMaterias(Model model) {
        model.addAttribute("titulo", semestre);
        return "lista";
    }

    @GetMapping("/materias/{id}")
    public String verDetalle(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        return "detalle";
    }

    @GetMapping("/buscar")
    public String buscarMateria(@RequestParam(name = "q", required = false) String query, Model model) {
        model.addAttribute("busqueda", query);
        return "busqueda";
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("materiaDTO", new MateriaDTO());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String procesarFormulario(@ModelAttribute MateriaDTO materiaDTO, Model model) {
        if (materiaDTO.getProfesor() != null && materiaDTO.getProfesor().trim().isEmpty()) {
            materiaDTO.setProfesor(null);
        }
        materias.add(materiaDTO);
        model.addAttribute("mensaje", "Materia " + materiaDTO.getNombre() + " guardada exitosamente.");
        return "exito";
    }
}
