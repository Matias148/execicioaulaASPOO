package com.exercicioaula.exercicioaula.resources;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")

public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public String resposta(){
        return "Rest funcionando";
    }



}
