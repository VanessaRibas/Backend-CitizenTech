package com.fiap.ec.backend_citizentech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "perfil_pcd")
public class Perfil_pcd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long usuario_id;

    @Column(nullable = false)
    private String tipoDeficiencia; // Ex: Visual, Mobilidade Reduzida, Auditiva

    @Column(nullable = false)
    private String enderecoResidencial;

    @Column(nullable = false)
    private String telefoneEmergencia;

    public Perfil_pcd() {
    }

    public Perfil_pcd(Long usuario_id, String tipoDeficiencia, String enderecoResidencial, String telefoneEmergencia) {
        this.usuario_id = usuario_id;
        this.tipoDeficiencia = tipoDeficiencia;
        this.enderecoResidencial = enderecoResidencial;
        this.telefoneEmergencia = telefoneEmergencia;
    }

    // Getters
    public Long getId() { return id; }
    public Long getUsuario_id() { return usuario_id; }
    public String getTipoDeficiencia() { return tipoDeficiencia; }
    public String getEnderecoResidencial() { return enderecoResidencial; }
    public String getTelefoneEmergencia() { return telefoneEmergencia; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setUsuario_id(Long usuario_id) { this.usuario_id = usuario_id; }
    public void setTipoDeficiencia(String tipoDeficiencia) { this.tipoDeficiencia = tipoDeficiencia; }
    public void setEnderecoResidencial(String enderecoResidencial) { this.enderecoResidencial = enderecoResidencial; }
    public void setTelefoneEmergencia(String telefoneEmergencia) { this.telefoneEmergencia = telefoneEmergencia; }
}