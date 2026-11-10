package com.fiap.ec.backend_citizentech.service;
 
import com.fiap.ec.backend_citizentech.model.Alerta;
import com.fiap.ec.backend_citizentech.repository.AlertaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
 
@Service
public class AlertaService {
 
    private final AlertaRepository repository;
 
    public AlertaService(AlertaRepository repository) {
        this.repository = repository;
    }
 
    public Alerta salvar(Alerta alerta) {
        return repository.save(alerta);
    }
 
    public List<Alerta> listar() {
        return repository.findAll();
    }
 
    public Alerta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alerta não encontrado"));
    }
}