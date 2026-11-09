package com.ito.OPGFact2_t4.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Empleados;

@RestController
@RequestMapping("/api")
public class DatosRestController {

    @GetMapping("/materias")
    public Map<String, Object> obtenerMaterias() {
        Empleados empleado1 = new Empleados("Juan", "Rodriguez", "Calle 2 No 1", "Programador", 25, 987654321, 001);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("estudiante", "Gael Fernando Ortíz Pérez");
        respuesta.put("semestre", 7);
        respuesta.put("materias", Arrays.asList(
                "Gestión de Proyectos de Software",
                "Administración de Redes",
                "Programación Web",
                "Taller de Investigación 1",
                "Sistemas Programables",
                "Programación Lógica y Funcional"));

        return respuesta;
    }
}