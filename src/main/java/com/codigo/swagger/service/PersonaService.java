package com.codigo.swagger.service;

import com.codigo.swagger.entity.PersonaEntity;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    PersonaEntity crear(PersonaEntity personaEntity);
    Optional<PersonaEntity> buscarPorId(Long id);
    List<PersonaEntity> buscarTodos();
    PersonaEntity actualizar(Long id, PersonaEntity personaEntity);
    PersonaEntity borrar(Long id);
}
