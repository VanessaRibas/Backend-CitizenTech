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
    
    public Alerta atualizar(Long id, Alerta alertaAtualizado) {

        Alerta alertaExistente = buscarPorId(id);
    
        alertaExistente.setTitulo(alertaAtualizado.getTitulo());

        alertaExistente.setDescricao(alertaAtualizado.getDescricao());

        alertaExistente.setTipo(alertaAtualizado.getTipo());

        alertaExistente.setNivelPrioridade(alertaAtualizado.getNivelPrioridade());

        alertaExistente.setEndereco(alertaAtualizado.getEndereco());

        alertaExistente.setLatitude(alertaAtualizado.getLatitude());

        alertaExistente.setLongitude(alertaAtualizado.getLongitude());

        alertaExistente.setOrigemDado(alertaAtualizado.getOrigemDado());

        alertaExistente.setNivelConfianca(alertaAtualizado.getNivelConfianca());

        alertaExistente.setDataRegistro(alertaAtualizado.getDataRegistro());

        alertaExistente.setAtivo(alertaAtualizado.getAtivo());
    
        return repository.save(alertaExistente);

    }
    
    public void deletar(Long id) {

        Alerta alerta = buscarPorId(id);

        repository.delete(alerta);

    }
 
}