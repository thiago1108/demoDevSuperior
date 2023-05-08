package com.devsuperior.demo.controller;

import com.devsuperior.demo.entitites.Department;
import com.devsuperior.demo.entitites.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // configura para responder Api
@RequestMapping (value = "/products") // configura caminho para reponder api
public class ProductController {

    @GetMapping
    public List <Product> getObjects() { // cria lista de produtos
        Department d1 = new Department( 1l, "Tech"); // instancia departamentos
        Department d2 = new Department( 2l, "Pet");

        Product p1 = new Product(1l, "macbook Pro" , 4000.0, d1); // instancia produtos
        Product p2 = new Product(2l, "PC Gamer" , 5000.0, d1);
        Product p3 = new Product(3l, "Pet House" , 3000.0, d2);

        List<Product> list = Arrays.asList(p1,p2,p3); // cria arrays de e salva em uma lista

        return list; // retorna lista
    }
}
