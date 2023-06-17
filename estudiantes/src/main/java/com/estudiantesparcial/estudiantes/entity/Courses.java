package com.estudiantesparcial.estudiantes.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
@Entity
@Table(name = "cursos")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombreCurso;

    public Courses() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
}
