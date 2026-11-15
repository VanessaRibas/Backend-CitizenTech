package com.fiap.ec.backend_citizentech.service;

import com.fiap.ec.backend_citizentech.model.AgentesOperacionais;
import com.fiap.ec.backend_citizentech.repository.AgentesOperacionaisRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgentesOperacionaisService {

    private final AgentesOperacionaisRepository repository;

    public AgentesOperacionaisService(AgentesOperacionaisRepository repository) {
        this.repository = repository;
    }

    public AgentesOperacionais salvar(AgentesOperacionais agentesOperacionais) {
        return repository.save(agentesOperacionais);
    }

    public List<AgentesOperacionais> listar() {
        return repository.findAll();
    }

    public AgentesOperacionais buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agente Operacional não encontrado"));
    }
    
    public AgentesOperacionais atualizar(Long id, AgentesOperacionais agentesOperacionaisAtualizado) {
        AgentesOperacionais agentesOperacionaisExistente = buscarPorId(id);
    
        agentesOperacionaisExistente.setUsuario_id(agentesOperacionaisAtualizado.getUsuario_id());
        agentesOperacionaisExistente.setNome_local(agentesOperacionaisAtualizado.getNome_local());
        agentesOperacionaisExistente.setEndereco(agentesOperacionaisAtualizado.getEndereco());
    
        return repository.save(agentesOperacionaisExistente);
    }
    
    public void deletar(Long id) {
        AgentesOperacionais agentesOperacionais = buscarPorId(id);
        repository.delete(agentesOperacionais);
    }
}