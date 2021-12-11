package com.practica.HolaSpring.dao;

import com.practica.HolaSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;
/*
CrudRepository<Typo de objeto que se trabajara en el crud , Tipo de dato del identificador de la tabla ID>
Trabaja mas facil con la implementacion de metodos de un CRUD (Create, Read, Update, Delete
Esto nos evita crear una clase de implementacion de la interface, ya que springboot la crea internamente
 */
public interface PersonaDAO extends CrudRepository<Persona, Long> {
}
