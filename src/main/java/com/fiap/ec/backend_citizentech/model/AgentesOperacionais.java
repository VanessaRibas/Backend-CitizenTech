package com.fiap.ec.backend_citizentech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "agentes_operacionais")
public class AgentesOperacionais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long usuario_id;

    @Column(nullable = false)
    private String nome_local;

    @Column(nullable = false)
    private String endereco;

    public AgentesOperacionais() {
    }

    public AgentesOperacionais(Long usuario_id, String nome_local, String endereco) {
        this.usuario_id = usuario_id;
        this.nome_local = nome_local;
        this.endereco = endereco;
    }

    // Getters
    public Long getId() { 
        return id; 
    }
    
    public Long getUsuario_id() { 
        return usuario_id; 
    }

    public String getNome_local() { 
        return nome_local; 
    }
    
    public String getEndereco() { 
        return endereco; 
    }

    // Setters
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public void setUsuario_id(Long usuario_id) { 
        this.usuario_id = usuario_id; 
    }

    public void setNome_local(String nome_local) { 
        this.nome_local = nome_local; 
    }
    
    public void setEndereco(String endereco) { 
        this.endereco = endereco; 
    }
}