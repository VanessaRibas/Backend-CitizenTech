package com.fiap.ec.backend_citizentech.service;

import com.fiap.ec.backend_citizentech.model.Evento;
import com.fiap.ec.backend_citizentech.repository.EventoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventoService {

    private final EventoRepository repository;

    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }

    public Evento salvar(Evento evento) {
        return repository.save(evento);
    }

    public List<Evento> listar() {
        return repository.findAll();
    }
    public Evento buscarPorId(Long id) {

    return repository.findById(id)

            .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

    }
    
    public Evento atualizar(Long id, Evento eventoAtualizado) {

        Evento eventoExistente = buscarPorId(id);
    
        eventoExistente.setTitulo(eventoAtualizado.getTitulo());

        eventoExistente.setDescricao(eventoAtualizado.getDescricao());

        eventoExistente.setTipo(eventoAtualizado.getTipo());

        eventoExistente.setEndereco(eventoAtualizado.getEndereco());

        eventoExistente.setLatitude(eventoAtualizado.getLatitude());

        eventoExistente.setLongitude(eventoAtualizado.getLongitude());

        eventoExistente.setDataRegistro(eventoAtualizado.getDataRegistro());

        eventoExistente.setStatus(eventoAtualizado.getStatus());
    
        return repository.save(eventoExistente);

    }
    
    public void deletar(Long id) {

        Evento evento = buscarPorId(id);

        repository.delete(evento);

    }
 
}