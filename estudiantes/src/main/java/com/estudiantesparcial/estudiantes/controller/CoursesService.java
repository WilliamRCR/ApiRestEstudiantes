package com.estudiantesparcial.estudiantes.controller;

import com.estudiantesparcial.estudiantes.dao.CoursesRepository;
import com.estudiantesparcial.estudiantes.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;
    public void guardar(Courses course){
        coursesRepository.save(course);
    }

    public List<Courses> obtenerCursos(){
        return coursesRepository.findAll();
    }

    public Courses obtenerCurso(Integer id){
        return coursesRepository.getOne(id);
    }


    public void actualizarCurso(Courses courses){
        coursesRepository.save(courses);
    }

    public void eliminarCurso(Integer id){
        coursesRepository.deleteById(id);
    }
}
