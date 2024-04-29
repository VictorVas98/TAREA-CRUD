package com.umg.Tarea_CRUD.services;
import com.umg.Tarea_CRUD.entities.Alumno;

import java.util.List;

public interface AlumnoService {

    public List<Alumno> findAll();
    public Alumno findById(Long id);
    public void create(Alumno alumno);
    public void update(Long id, Alumno alumno);
    public void delete(Long id);


}