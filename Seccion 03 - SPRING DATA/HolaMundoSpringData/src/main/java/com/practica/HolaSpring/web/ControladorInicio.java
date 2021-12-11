package com.practica.HolaSpring.web;

import com.practica.HolaSpring.dao.PersonaDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
@RestController
Permite que spring reconosca esta clase como un componente y lo
agrega al contenedor de clases de spring

@Slf4j - (LOMBOK)
Permite imprimir en mensajes a nivel de info en la terminal de Spring en tiempo de ejecucion.
Equivalente al log.i de android studio.
Los loggs permitidos se pueden configurar en el application.properties
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaDAO personaDAO;

    //Ruta de acceso del metodo (TIPO GET)
    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaDAO.findAll();
        /*
        El modelo esta funcionando como medio de comunicacion entre la vista y el modelo,
        estructura que sigue el MVC
         */

        model.addAttribute("personas", personas);
        log.info("ejecutando el controlador Spring MVC");

        return "index";
    }
}
