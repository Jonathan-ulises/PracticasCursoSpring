package com.practica.HolaSpring.domain;

import lombok.Data;

/*
@Data
Anotaciond de LOMBOK
Obtiene el estandar de un bean (POJO / MODELO)
 */
@Data
public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
