package com.estudiantesparcial.estudiantes.controller;

import com.estudiantesparcial.estudiantes.entity.Students;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentsController {

    private StudentsService studentsService;

    @GetMapping("api/estudiante")
    public List<Students> listaEstudiantes(){
        List<Students> listaEstudiantes = new ArrayList<>();

        Students e = new Students();
        e.setId(1);
        e.setNombres("Palo");
        e.setApellidos("cal");
        e.setCurso("Mate");
        e.setNota(120);

        listaEstudiantes.add(e);
        return listaEstudiantes;
    }

    @PostMapping("api/estudiante")
    public Students guardarEstudiante(@RequestBody Students students){
        studentsService.guardar(students);
        return null;
    }

    @GetMapping("api/estudiante")
    public List<Students> obtener(){

        return studentsService.obtenerTodos();
    }

    @GetMapping("api/estudiante/{id}")
    public Students obtenerEstudiante(@PathVariable("id") Integer id){
        return studentsService.obtenerEstudiante(id);
    }

    @PutMapping("api/estudiante")
    public void actualizarEstudiante(@RequestBody Students students){
        studentsService.actualizar(students);
    }
    @DeleteMapping("api/estudiante/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        studentsService.eliminar(id);
    }
}
