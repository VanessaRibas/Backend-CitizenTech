package com.fiap.ec.backend_citizentech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contato_emergencia")
public class ContatoEmergencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long usuario_id;

    @Column(nullable = false)
    private Long pcd_id;

    @Column(nullable = false)
    private String telefone;

    public ContatoEmergencia() {
    }

    public ContatoEmergencia(Long usuario_id, Long pcd_id, String telefone) {
        this.usuario_id = usuario_id;
        this.pcd_id = pcd_id;
        this.telefone = telefone;
    }

    // Getters
    public Long getId() { 
        return id; 
    }
    
    public Long getUsuario_id() { 
        return usuario_id; 
    }

    public Long getPcd_id() { 
        return pcd_id; 
    }
    
    public String getTelefone() { 
        return telefone; 
    }

    // Setters
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public void setUsuario_id(Long usuario_id) { 
        this.usuario_id = usuario_id; 
    }

    public void setPcd_id(Long pcd_id) { 
        this.pcd_id = pcd_id; 
    }
    
    public void setTelefone(String telefone) { 
        this.telefone = telefone; 
    }
}