package com.estudiantesparcial.estudiantes.controller;

import com.estudiantesparcial.estudiantes.dao.StudentsRepository;
import com.estudiantesparcial.estudiantes.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;
    public void guardar(Students student){
        studentsRepository.save(student);
    }

    public List<Students> obtenerTodos(){
        return studentsRepository.findAll();
    }

    public Students obtenerEstudiante(Integer id){
        return studentsRepository.getOne(id);
    }


    public void actualizar(Students students){
        studentsRepository.save(students);
    }

    public void eliminar(Integer id){
        studentsRepository.deleteById(id);
    }

}
