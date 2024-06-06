package com.codigo.swagger.dao;

import com.codigo.swagger.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {


    Optional<PersonaEntity> findByEstado(int estado);
    //Select * from Personas where estado = 1 || 0;
}
