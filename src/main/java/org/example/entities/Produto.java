package org.example.entities;

public class Produto {

    private Long id;
    private  String name;

    private Double preco;

    private Departamento departamento;

    public Produto(){


    }

    public Produto(Long id, String name, Double preco, Departamento departamento) {
        this.id = id;
        this.name = name;
        this.preco = preco;
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }




}
