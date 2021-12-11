package com.practica.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController
Permite que spring reconosca esta clase como un componente y lo
agrega al contenedor de clases de spring

@Slf4j - (LOMBOK)
Permite imprimir en mensajes a nivel de info en la terminal de Spring en tiempo de ejecucion.
Equivalente al log.i de android studio.
Los loggs permitidos se pueden configurar en el application.properties
 */
@RestController
@Slf4j
public class ControladorInicio {

    //Ruta de acceso del metodo (TIPO GET)
    @GetMapping("/")
    public String inicio() {
        log.info("ejecutando el controlador rest");
        log.debug("Mas detalle del controlador");
        return "Hola Mundo UwU con Spring 2";
    }
}
