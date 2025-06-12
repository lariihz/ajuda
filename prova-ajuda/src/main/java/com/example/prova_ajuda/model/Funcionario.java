package com.example.prova_ajuda.model;

import jakarta.persistence.*;

// Indica que essa classe é uma entidade do banco de dados (tabela)
@Entity
public class Funcionario {
    @Id // Indica que esse atributo é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)      
    
    private Long id; // Configura a geração automática do valor do id (auto-incremento no banco)
    private String nome; //atributo para armazenar o nome 
    private String cargo; //atributo para armanezar o cargo

    public Funcionario() {} // contrutor padrao vazio (para frameworks e jpa)

    public Funcionario(String nome, String cargo) { // construtor que inicializa o obj nome e cargo
        this.nome = nome;
        this.cargo = cargo;
    }

    // Getters e Setters
    public Long getId() { return id; } // retorna o id
    public void setId(Long id) { this.id = id; } // define o valor do id

    public String getNome() { return nome; } // retorna 
    public void setNome(String nome) { this.nome = nome; } // define nome

    public String getCargo() { return cargo; } // retorna 
    public void setCargo(String cargo) { this.cargo = cargo; } // define 
}
