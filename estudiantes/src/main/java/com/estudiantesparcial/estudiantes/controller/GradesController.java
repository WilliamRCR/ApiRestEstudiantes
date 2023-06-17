package com.estudiantesparcial.estudiantes.controller;


import com.estudiantesparcial.estudiantes.entity.Grades;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GradesController {

    private GradesService gradesService;

    @PostMapping("api/estudiante")
    public Grades guardarNota(@RequestBody Grades grade){
        gradesService.guardarNota(grade);
        return null;
    }


}
