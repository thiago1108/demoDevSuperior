package com.devsuperior.demo.entitites;

public class Department {

    private long id;
    private String name;

    public Department (){  // metodo construtor sem argumentos

    }

    public Department(long id, String name) { // metodo construtor com arguento
        this.id = id;
        this.name = name;
    }
     // gets e sets
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
