package com.practica.HolaSpring;

import com.practica.HolaSpring.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Value("${index.saludo}")
    private String saludo;

    //Ruta de acceso del metodo (TIPO GET)
    @GetMapping("/")
    public String inicio(Model model) {
        /*
        El modelo esta funcionando como medio de comunicacion entre la vista y el modelo,
        estructura que sigue el MVC
         */
        var mensaje = "Mensaje con thymeleaf";

        var persona = new Persona();
        persona.setNombre("Jonathan");
        persona.setApellido("Sanchez");
        persona.setEmail("jsanchez@gmail.com");
        persona.setTelefono("22341233");

        var persona2 = new Persona();
        persona2.setNombre("Araceli");
        persona2.setApellido("Ramirez");
        persona2.setEmail("aramirez@gmail.com");
        persona2.setTelefono("42345623");

        /*
        FORMA DE CREAR UN ARRA
        var personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2);*/

        //OTRA FORMA DE CREAR UN ARRAY
        var personas = Arrays.asList(persona, persona2);

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
//        model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);

        log.info("ejecutando el controlador Spring MVC");

        return "index";
    }
}
