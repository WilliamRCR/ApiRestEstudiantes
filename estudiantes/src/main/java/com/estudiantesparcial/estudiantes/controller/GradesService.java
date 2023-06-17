package com.estudiantesparcial.estudiantes.controller;

import com.estudiantesparcial.estudiantes.dao.GradesRepository;
import com.estudiantesparcial.estudiantes.entity.Grades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradesService {

    @Autowired
    private GradesRepository gradesRepository;

    public void guardarNota(Grades grade){
        gradesRepository.save(grade);
    }

    public Grades obtenerNotasEstudianteCurso(Integer id){
        return gradesRepository.getOne(id);
    }


    public Grades obtenerNotasEstudiante(Integer id){ return gradesRepository.getReferenceById(id);
    }
}
