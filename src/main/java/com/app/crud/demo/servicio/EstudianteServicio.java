package com.app.crud.demo.servicio;

import java.util.List;

import com.app.crud.demo.entidad.Estudiante;

public interface EstudianteServicio {

    public List<Estudiante> listarTodosLosEstudiantes();

    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudianteid(long id);

    public Estudiante actualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(long id);
}
