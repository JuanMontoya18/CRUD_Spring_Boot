package com.app.crud.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.crud.demo.entidad.Estudiante;
import com.app.crud.demo.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServivioImpl implements EstudianteServicio {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
        // TODO Auto-generated method stub
        return estudianteRepositorio.findAll();
    }

}
