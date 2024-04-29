package com.umg.Tarea_CRUD.controllers;


import com.umg.Tarea_CRUD.entities.Alumno;
import com.umg.Tarea_CRUD.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> GetAll(){
        return alumnoService.findAll();
    }

    @GetMapping(value="/{id}")
    public Alumno GetById(@PathVariable Long id){
        return alumnoService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Alumno alumno){
        alumnoService.create(alumno);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Alumno alumno){
        alumnoService.update(id, alumno);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        alumnoService.delete(id);
    }
}
