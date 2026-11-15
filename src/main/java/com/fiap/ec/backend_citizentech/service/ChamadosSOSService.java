package com.fiap.ec.backend_citizentech.service;

import com.fiap.ec.backend_citizentech.model.ChamadosSOS;
import com.fiap.ec.backend_citizentech.repository.ChamadosSOSRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ChamadosSOSService {

    private final ChamadosSOSRepository repository;

    public ChamadosSOSService(ChamadosSOSRepository repository) {
        this.repository = repository;
    }

    public ChamadosSOS salvar(ChamadosSOS chamado) {
        return repository.save(chamado);
    }

    public List<ChamadosSOS> listar() {
        return repository.findAll();
    }

    public ChamadosSOS buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chamado SOS não encontrado"));
    }
    
    public ChamadosSOS atualizar(Long id, ChamadosSOS chamadoAtualizado) {
        ChamadosSOS chamadoExistente = buscarPorId(id);
    
        chamadoExistente.setPcdId(chamadoAtualizado.getPcdId());
        chamadoExistente.setAgenteId(chamadoAtualizado.getAgenteId());
        chamadoExistente.setNivelAcionamento(chamadoAtualizado.getNivelAcionamento());
        chamadoExistente.setLatitude(chamadoAtualizado.getLatitude());
        chamadoExistente.setLongitude(chamadoAtualizado.getLongitude());
        chamadoExistente.setStatus(chamadoAtualizado.getStatus());
        chamadoExistente.setDataHora(chamadoAtualizado.getDataHora());
    
        return repository.save(chamadoExistente);
    }
    
    public void deletar(Long id) {
        ChamadosSOS chamado = buscarPorId(id);
        repository.delete(chamado);
    }
}