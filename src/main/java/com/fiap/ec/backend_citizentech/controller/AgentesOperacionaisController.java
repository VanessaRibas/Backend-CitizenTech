package com.fiap.ec.backend_citizentech.controller;

import com.fiap.ec.backend_citizentech.model.AgentesOperacionais;
import com.fiap.ec.backend_citizentech.service.AgentesOperacionaisService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/agentesOperacionais")
@CrossOrigin
public class AgentesOperacionaisController {

    private final AgentesOperacionaisService service;

    public AgentesOperacionaisController(AgentesOperacionaisService service) {
        this.service = service;
    }

    @PostMapping
    public AgentesOperacionais criar(@RequestBody AgentesOperacionais agentesOperacionais) {
        return service.salvar(agentesOperacionais);
    }

    @GetMapping
    public List<AgentesOperacionais> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public AgentesOperacionais buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public AgentesOperacionais atualizar(@PathVariable Long id, @RequestBody AgentesOperacionais agentesOperacionais) {
        return service.atualizar(id, agentesOperacionais);
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}