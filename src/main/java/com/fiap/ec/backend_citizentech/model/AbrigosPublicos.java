package com.fiap.ec.backend_citizentech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "abrigos_publicos")
public class AbrigosPublicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    private Double latitude;

    private Double longitude;

    @Column(nullable = false)
    private Boolean temRampa;

    @Column(nullable = false)
    private Boolean temElevador;

    @Column(nullable = false)
    private String status; // Alterado para String (texto livre)

    @Column(nullable = false)
    private Integer capacidadeAtual;

    @Column(nullable = false)
    private Integer capacidadeMaxima;

    public AbrigosPublicos() {
    }

    public AbrigosPublicos(String nome, String endereco, Double latitude, Double longitude, 
                           Boolean temRampa, Boolean temElevador, String status, 
                           Integer capacidadeAtual, Integer capacidadeMaxima) {
        this.nome = nome;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.temRampa = temRampa;
        this.temElevador = temElevador;
        this.status = status;
        this.capacidadeAtual = capacidadeAtual;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    // Getters
    public Long getId() { 
        return id; 
    }
    
    public String getNome() { 
        return nome; 
    }
    
    public String getEndereco() { 
        return endereco; 
    }
    
    public Double getLatitude() { 
        return latitude; 
    }
    
    public Double getLongitude() { 
        return longitude; 
    }
    
    public Boolean getTemRampa() { 
        return temRampa; 
    }
    
    public Boolean getTemElevador() { 
        return temElevador; 
    }
    
    public String getStatus() { 
        return status; 
    }
    
    public Integer getCapacidadeAtual() { 
        return capacidadeAtual; 
    }
    
    public Integer getCapacidadeMaxima() { 
        return capacidadeMaxima; 
    }

    // Setters
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
    
    public void setEndereco(String endereco) { 
        this.endereco = endereco; 
    }
    
    public void setLatitude(Double latitude) { 
        this.latitude = latitude; 
    }
    
    public void setLongitude(Double longitude) { 
        this.longitude = longitude; 
    }
    
    public void setTemRampa(Boolean temRampa) { 
        this.temRampa = temRampa; 
    }
    
    public void setTemElevador(Boolean temElevador) { 
        this.temElevador = temElevador; 
    }
    
    public void setStatus(String status) { 
        this.status = status; 
    }
    
    public void setCapacidadeAtual(Integer capacidadeAtual) { 
        this.capacidadeAtual = capacidadeAtual; 
    }
    
    public void setCapacidadeMaxima(Integer capacidadeMaxima) { 
        this.capacidadeMaxima = capacidadeMaxima; 
    }
}