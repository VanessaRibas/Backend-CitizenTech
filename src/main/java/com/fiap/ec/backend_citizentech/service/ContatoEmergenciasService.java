package com.fiap.ec.backend_citizentech.service;

import com.fiap.ec.backend_citizentech.model.ContatoEmergencia;
import com.fiap.ec.backend_citizentech.repository.ContatoEmergenciaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContatoEmergenciasService {

    private final ContatoEmergenciaRepository repository;

    public ContatoEmergenciasService(ContatoEmergenciaRepository repository) {
        this.repository = repository;
    }

    public ContatoEmergencia salvar(ContatoEmergencia contatoEmergencia) {
        return repository.save(contatoEmergencia);
    }

    public List<ContatoEmergencia> listar() {
        return repository.findAll();
    }

    public ContatoEmergencia buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato de emergência não encontrado"));
    }
    
    public ContatoEmergencia atualizar(Long id, ContatoEmergencia contatoEmergenciaAtualizado) {
        ContatoEmergencia contatoEmergenciaExistente = buscarPorId(id);
    
        contatoEmergenciaExistente.setUsuario_id(contatoEmergenciaAtualizado.getUsuario_id());
        contatoEmergenciaExistente.setPcd_id(contatoEmergenciaAtualizado.getPcd_id());
        contatoEmergenciaExistente.setTelefone(contatoEmergenciaAtualizado.getTelefone());
    
        return repository.save(contatoEmergenciaExistente);
    }
    
    public void deletar(Long id) {
        ContatoEmergencia contatoEmergencia = buscarPorId(id);
        repository.delete(contatoEmergencia);
    }
}