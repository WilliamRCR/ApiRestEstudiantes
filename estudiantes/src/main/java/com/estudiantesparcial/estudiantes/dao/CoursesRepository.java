package com.estudiantesparcial.estudiantes.dao;

import com.estudiantesparcial.estudiantes.entity.Courses;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer>{
}
