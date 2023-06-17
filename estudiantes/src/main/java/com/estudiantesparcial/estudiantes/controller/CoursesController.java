package com.estudiantesparcial.estudiantes.controller;

import com.estudiantesparcial.estudiantes.entity.Courses;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoursesController {

    private CoursesService coursesService;

    @GetMapping("api/courses")
    public List<Courses> listaCursos(){
        List<Courses> listaCursos = new ArrayList<>();
        return listaCursos;
    }

    @PostMapping("api/courses")
    public Courses guardarCurso(@RequestBody Courses course){
        coursesService.guardar(course);
        return null;
    }

    @GetMapping("api/courses")
    public List<Courses> obtenerCursos(){
        return coursesService.obtenerCursos();
    }

    @GetMapping("api/estudiante/{id}")
    public Courses obtenerCurso(@PathVariable("id") Integer id) {return coursesService.obtenerCurso(id);}

    @PutMapping("api/courses")
    public void actualizarCurso(@RequestBody Courses curso) {coursesService.actualizarCurso(curso);}

    @DeleteMapping("api/courses/{id}")
    public void eliminarCurso(@PathVariable ("id") Integer id) {coursesService.eliminarCurso(id);}

}
