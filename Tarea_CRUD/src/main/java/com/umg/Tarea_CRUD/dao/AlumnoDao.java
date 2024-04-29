package com.umg.Tarea_CRUD.dao;

import com.umg.Tarea_CRUD.entities.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoDao extends CrudRepository<Alumno, Long> {
}
