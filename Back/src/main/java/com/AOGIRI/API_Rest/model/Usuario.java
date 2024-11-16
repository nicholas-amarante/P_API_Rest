package com.AOGIRI.API_Rest.model;

import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)//Serve para dizer que nesse campo vai ser imcrmentado o valor do ID
    @Column(name="id")
    private Integer id;
    @Column(name="nome_completo", length=200, nullable=true)
    private String name;
    @Column(name="email", length=50, nullable=true)
    private String email;
    @Column(name="senha", columnDefinition = "TEXT", nullable=true)
    private String password;
    @Column(name="telefone", length=15, nullable=true)
    private String number;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
