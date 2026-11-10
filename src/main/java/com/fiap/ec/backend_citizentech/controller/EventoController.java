package com.fiap.ec.backend_citizentech.controller;

import com.fiap.ec.backend_citizentech.model.Evento;
import com.fiap.ec.backend_citizentech.service.EventoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/eventos")
@CrossOrigin
public class EventoController {

    private final EventoService service;

    public EventoController(EventoService service) {
        this.service = service;
    }

    @PostMapping
    public Evento criar(@RequestBody Evento evento) {
        return service.salvar(evento);
    }

    @GetMapping
    public List<Evento> listar() {
        return service.listar();
    }
    @GetMapping("/{id}")
    public Evento buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    
    @PutMapping("/{id}")
    public Evento atualizar(@PathVariable Long id, @RequestBody Evento evento) {
        return service.atualizar(id, evento);
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}