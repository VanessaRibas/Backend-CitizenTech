package com.fiap.ec.backend_citizentech.service;

import com.fiap.ec.backend_citizentech.model.LocaisSeguros;
import com.fiap.ec.backend_citizentech.repository.LocaisSegurosRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocaisSegurosService {

    private final LocaisSegurosRepository repository;

    public LocaisSegurosService(LocaisSegurosRepository repository) {
        this.repository = repository;
    }

    public LocaisSeguros salvar(LocaisSeguros locaisSeguros) {
        return repository.save(locaisSeguros);
    }

    public List<LocaisSeguros> listar() {
        return repository.findAll();
    }

    public LocaisSeguros buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Local seguro não encontrado"));
    }
    
    public LocaisSeguros atualizar(Long id, LocaisSeguros locaisSegurosAtualizado) {
        LocaisSeguros locaisSegurosExistente = buscarPorId(id);
    
        locaisSegurosExistente.setPcd_id(locaisSegurosAtualizado.getPcd_id());
        locaisSegurosExistente.setNomeLocal(locaisSegurosAtualizado.getNomeLocal());
        locaisSegurosExistente.setEndereco(locaisSegurosAtualizado.getEndereco());
    
        return repository.save(locaisSegurosExistente);
    }
    
    public void deletar(Long id) {
        LocaisSeguros locaisSeguros = buscarPorId(id);
        repository.delete(locaisSeguros);
    }
}