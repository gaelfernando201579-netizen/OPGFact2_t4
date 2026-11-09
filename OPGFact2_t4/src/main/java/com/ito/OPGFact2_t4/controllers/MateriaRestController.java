package com.ito.OPGFact2_t4.controllers;

import models.dto.MateriaDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/materias")
public class MateriaRestController {

    @Value("${config.alumno}")
    private String alumno;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.semestre}")
    private String semestre;

    @PostMapping("/solicitud")
    public MateriaDTO recibirMateria(@RequestBody MateriaDTO materiaDTO) {
        return materiaDTO;
    }

    @GetMapping("/valores")
    public Map<String, Object> valores() {
        Map<String, Object> json = new HashMap<>();
        json.put("alumno", alumno);
        json.put("codigo", codigo);
        json.put("mensaje", mensaje);
        json.put("semestre", semestre);
        return json;
    }
}