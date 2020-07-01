package com.exercicioaula.exercicioaula.resources;

import com.exercicioaula.exercicioaula.domain.Categoria;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")

public class CategoriaResource {

    //@GetMapping

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> resposta(){
        Categoria cat1 = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria(2, "Escritorio");

        List<Categoria> lsita = new ArrayList<Categoria>();
        lsita.add(cat1);
        lsita.add(cat2);

        return lsita;

        //return "Rest funcionando";
    }

}
