package com.fiap.ec.backend_citizentech.model;
 
import jakarta.persistence.*;

import java.time.LocalDateTime;
 
@Entity

@Table(name = "alertas")

public class Alerta {
 
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
 
    @Column(nullable = false)

    private String titulo;
 
    private String descricao;
 
    @Column(nullable = false)

    private String tipo;
 
    @Column(nullable = false)

    private String nivelPrioridade;
 
    @Column(nullable = false)

    private String endereco;
 
    private Double latitude;
 
    private Double longitude;
 
    private String origemDado;
 
    private Double nivelConfianca;
 
    private LocalDateTime dataRegistro;
 
    private Boolean ativo;
 
    public Alerta() {

    }
 
    public Alerta(String titulo, String descricao, String tipo,

                  String nivelPrioridade, String endereco,

                  Double latitude, Double longitude,

                  String origemDado, Double nivelConfianca,

                  LocalDateTime dataRegistro, Boolean ativo) {

        this.titulo = titulo;

        this.descricao = descricao;

        this.tipo = tipo;

        this.nivelPrioridade = nivelPrioridade;

        this.endereco = endereco;

        this.latitude = latitude;

        this.longitude = longitude;

        this.origemDado = origemDado;

        this.nivelConfianca = nivelConfianca;

        this.dataRegistro = dataRegistro;

        this.ativo = ativo;

    }
 
    public Long getId() { return id; }

    public String getTitulo() { return titulo; }

    public String getDescricao() { return descricao; }

    public String getTipo() { return tipo; }

    public String getNivelPrioridade() { return nivelPrioridade; }

    public String getEndereco() { return endereco; }

    public Double getLatitude() { return latitude; }

    public Double getLongitude() { return longitude; }

    public String getOrigemDado() { return origemDado; }

    public Double getNivelConfianca() { return nivelConfianca; }

    public LocalDateTime getDataRegistro() { return dataRegistro; }

    public Boolean getAtivo() { return ativo; }
 
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public void setNivelPrioridade(String nivelPrioridade) { this.nivelPrioridade = nivelPrioridade; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public void setLongitude(Double longitude) { this.longitude = longitude; }

    public void setOrigemDado(String origemDado) { this.origemDado = origemDado; }

    public void setNivelConfianca(Double nivelConfianca) { this.nivelConfianca = nivelConfianca; }

    public void setDataRegistro(LocalDateTime dataRegistro) { this.dataRegistro = dataRegistro; }

    public void setAtivo(Boolean ativo) { this.ativo = ativo; }

}
 