package com.devsuperior.demo.controller;

import com.devsuperior.demo.entitites.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/products")
public class ProductController {

    @GetMapping
    public Department getObjects() {
        Department d1 = new Department();
        d1.setId(1L);
        d1.setName("Tech");
        return d1;
    }
}
