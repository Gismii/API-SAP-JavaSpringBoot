package org.example.controller;

import org.example.entities.Departamento;
import org.example.entities.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProductController {

    @GetMapping
    public List<Produto> getObjects(){

        Departamento d1 = new Departamento(1l, "Tech");
        Departamento d2 = new Departamento(2l, "Pet");


        Produto p1 = new Produto(1l, "Macbook", 4000.0, d1);
        Produto p2 = new Produto(2l, "Smart Fone", 2000.0, d1);
        Produto p3 = new Produto(3l, "Brinquedo", 300.0, d2);
        Produto p4 = new Produto(4l, "Bola", 50.0, d2);

        List<Produto> list = Arrays.asList(p1,p2,p3,p4);

        return list;
    }


}
