package com.estudiantesparcial.estudiantes.dao;

import com.estudiantesparcial.estudiantes.entity.Grades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradesRepository extends JpaRepository <Grades, Integer> {

}
