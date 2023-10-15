package com.app.crud.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import com.app.crud.demo.servicio.EstudianteServicio;

@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio estudianteServicio;

    @GetMapping("/estudiante")
    public String listarEstudiante(Model modelo) {
        modelo.addAttribute("estudiantes", estudianteServicio.listarTodosLosEstudiantes());
        return "estudiantes";
    }

}
