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
}