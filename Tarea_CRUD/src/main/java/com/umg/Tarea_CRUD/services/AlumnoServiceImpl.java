package com.umg.Tarea_CRUD.services;

import com.umg.Tarea_CRUD.dao.AlumnoDao;
import com.umg.Tarea_CRUD.entities.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoDao alumnoDao;

    @Override
    public List<Alumno> findAll() {
        return (List<Alumno>) alumnoDao.findAll();
    }

    @Override
    public Alumno findById(Long id) {
        return alumnoDao.findById(id).orElse(null);
    }

    @Override
    public void create(Alumno alumno) {
        alumnoDao.save(alumno);
    }

    @Override
    public void update(Long id, Alumno alumno) {
        if (alumnoDao.existsById(id)){
            alumno.setId(id);
            alumnoDao.save(alumno);
        }
    }

    @Override
    public void delete(Long id) {
        if (alumnoDao.existsById(id)){
            alumnoDao.deleteById(id);
        }
    }

}
