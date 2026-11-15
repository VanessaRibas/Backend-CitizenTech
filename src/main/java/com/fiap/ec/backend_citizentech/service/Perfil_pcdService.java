package com.fiap.ec.backend_citizentech.service;

import com.fiap.ec.backend_citizentech.model.Perfil_pcd;
import com.fiap.ec.backend_citizentech.repository.Perfil_pcdRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Perfil_pcdService {

    private final Perfil_pcdRepository repository;

    public Perfil_pcdService(Perfil_pcdRepository repository) {
        this.repository = repository;
    }

    public Perfil_pcd salvar(Perfil_pcd perfil_pcd) {
        return repository.save(perfil_pcd);
    }

    public List<Perfil_pcd> listar() {
        return repository.findAll();
    }

    public Perfil_pcd buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Perfil_pcd não encontrado"));
    }
    
    public Perfil_pcd atualizar(Long id, Perfil_pcd perfil_pcdAtualizado) {
        Perfil_pcd perfil_pcdExistente = buscarPorId(id);
    
        perfil_pcdExistente.setUsuario_id(perfil_pcdAtualizado.getUsuario_id());
        perfil_pcdExistente.setTipoDeficiencia(perfil_pcdAtualizado.getTipoDeficiencia());
        perfil_pcdExistente.setEnderecoResidencial(perfil_pcdAtualizado.getEnderecoResidencial());
        perfil_pcdExistente.setTelefoneEmergencia(perfil_pcdAtualizado.getTelefoneEmergencia());
    
        return repository.save(perfil_pcdExistente);
    }
    
    public void deletar(Long id) {
        Perfil_pcd perfil_pcd = buscarPorId(id);
        repository.delete(perfil_pcd);
    }
}