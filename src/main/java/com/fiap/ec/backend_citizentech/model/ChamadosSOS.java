package com.fiap.ec.backend_citizentech.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "chamados_sos")
public class ChamadosSOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long pcdId;

    @Column(nullable = false)
    private Long agenteId;

    @Column(nullable = false)
    private String nivelAcionamento;

    private Double latitude;
    private Double longitude;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private LocalDateTime dataHora;

    public ChamadosSOS() {
    }

    public ChamadosSOS(Long pcdId, Long agenteId, String nivelAcionamento, 
                       Double latitude, Double longitude, String status, LocalDateTime dataHora) {
        this.pcdId = pcdId;
        this.agenteId = agenteId;
        this.nivelAcionamento = nivelAcionamento;
        this.latitude = latitude;
        this.longitude = longitude;
        this.status = status;
        this.dataHora = dataHora;
    }

    // Getters
    public Long getId() { return id; }
    public Long getPcdId() { return pcdId; }
    public Long getAgenteId() { return agenteId; }
    public String getNivelAcionamento() { return nivelAcionamento; }
    public Double getLatitude() { return latitude; }
    public Double getLongitude() { return longitude; }
    public String getStatus() { return status; }
    public LocalDateTime getDataHora() { return dataHora; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setPcdId(Long pcdId) { this.pcdId = pcdId; }
    public void setAgenteId(Long agenteId) { this.agenteId = agenteId; }
    public void setNivelAcionamento(String nivelAcionamento) { this.nivelAcionamento = nivelAcionamento; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
    public void setStatus(String status) { this.status = status; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
}