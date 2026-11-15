package com.fiap.ec.backend_citizentech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "locais_seguros")
public class LocaisSeguros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long pcd_id; // Chave estrangeira referenciando o perfil PCD

    @Column(nullable = false)
    private String nomeLocal;

    @Column(nullable = false)
    private String endereco;

    public LocaisSeguros() {
    }

    public LocaisSeguros(Long pcd_id, String nomeLocal, String endereco) {
        this.pcd_id = pcd_id;
        this.nomeLocal = nomeLocal;
        this.endereco = endereco;
    }

    // Getters
    public Long getId() { 
        return id; 
    }
    
    public Long getPcd_id() { 
        return pcd_id; 
    }
    
    public String getNomeLocal() { 
        return nomeLocal; 
    }
    
    public String getEndereco() { 
        return endereco; 
    }

    // Setters
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public void setPcd_id(Long pcd_id) { 
        this.pcd_id = pcd_id; 
    }
    
    public void setNomeLocal(String nomeLocal) { 
        this.nomeLocal = nomeLocal; 
    }
    
    public void setEndereco(String endereco) { 
        this.endereco = endereco; 
    }
}