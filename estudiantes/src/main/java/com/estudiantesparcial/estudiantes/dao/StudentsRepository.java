package com.estudiantesparcial.estudiantes.dao;

import com.estudiantesparcial.estudiantes.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {


}
