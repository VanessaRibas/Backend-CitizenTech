
package com.fiap.ec.backend_citizentech.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String descricao;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String endereco;

    private Double latitude;

    private Double longitude;

    private LocalDateTime dataRegistro;

    @Column(nullable = false)
    private String status;

    public Evento() {}

    public Evento(String titulo, String descricao, String tipo,
                  String endereco, Double latitude, Double longitude,
                  LocalDateTime dataRegistro, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dataRegistro = dataRegistro;
        this.status = status;
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public String getTipo() { return tipo; }
    public String getEndereco() { return endereco; }
    public Double getLatitude() { return latitude; }
    public Double getLongitude() { return longitude; }
    public LocalDateTime getDataRegistro() { return dataRegistro; }
    public String getStatus() { return status; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
    public void setDataRegistro(LocalDateTime dataRegistro) { this.dataRegistro = dataRegistro; }
    public void setStatus(String status) { this.status = status; }
}
