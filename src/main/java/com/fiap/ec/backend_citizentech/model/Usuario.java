package com.fiap.ec.backend_citizentech.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senhaHash;

    @Column(nullable = false)
    private String tipoPerfil; // Valores esperados: "pcd", "contato", "admin"

    private LocalDateTime criado_em;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senhaHash, String tipoPerfil, LocalDateTime criado_em) {
        this.nome = nome;
        this.email = email;
        this.senhaHash = senhaHash;
        this.tipoPerfil = tipoPerfil;
        this.criado_em = criado_em;
    }

    // Getters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenhaHash() { return senhaHash; }
    public String getTipoPerfil() { return tipoPerfil; }
    public LocalDateTime getCriado_em() { return criado_em; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setSenhaHash(String senhaHash) { this.senhaHash = senhaHash; }
    public void setTipoPerfil(String tipoPerfil) { this.tipoPerfil = tipoPerfil; }
    public void setCriado_em(LocalDateTime criado_em) { this.criado_em = criado_em; }
}