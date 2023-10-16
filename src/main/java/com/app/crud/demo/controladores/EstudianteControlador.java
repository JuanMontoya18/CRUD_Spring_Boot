package com.app.crud.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.app.crud.demo.entidad.Estudiante;
import com.app.crud.demo.servicio.EstudianteServicio;

@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio estudianteServicio;

    @GetMapping({ "/estudiante", "/" })
    public String listarEstudiante(Model modelo) {
        modelo.addAttribute("estudiante", estudianteServicio.listarTodosLosEstudiantes());
        return "estudiante";
    }

    @GetMapping("/estudiante/nuevo")
    public String crearEstudianteFormulario(Model modelo) {
        Estudiante estudiante = new Estudiante();
        modelo.addAttribute("estudiante", estudiante);
        return "crear_Estudiante";
    }

    @PostMapping("/estudiante")
    public String guardarEstudiante(@ModelAttribute("estudante") Estudiante estudiante) {
        estudianteServicio.guardarEstudiante(estudiante);
        return "redirect:/estudiante";
    }

    @GetMapping("/estudiante/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable long id, Model modelo) {
        modelo.addAttribute("estudiante", estudianteServicio.obtenerEstudianteid(id));
        return "editar_Estudiante";
    }

    @PutMapping("/estudiante/{id}")
    public String actualizarEstudiante(@PathVariable long id, @ModelAttribute("estudiante") Estudiante estudiante,
            Model modelo) {

        Estudiante estudianteExistente = estudianteServicio.obtenerEstudianteid(id);
        estudianteExistente.setId(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setEmail(estudiante.getEmail());

        estudianteServicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiante";
    }

    @GetMapping("/estudiante/{id}")
    public String eliminarEstudiante(@PathVariable long id) {
        estudianteServicio.eliminarEstudiante(id);
        return "redirect:/estudiante";
    }
}
