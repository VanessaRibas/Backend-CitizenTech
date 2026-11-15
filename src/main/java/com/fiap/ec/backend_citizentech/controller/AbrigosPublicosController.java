package com.fiap.ec.backend_citizentech.controller;

import com.fiap.ec.backend_citizentech.model.AbrigosPublicos;
import com.fiap.ec.backend_citizentech.service.AbrigosPublicosService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/abrigosPublicos")
@CrossOrigin
public class AbrigosPublicosController {

    private final AbrigosPublicosService service;

    public AbrigosPublicosController(AbrigosPublicosService service) {
        this.service = service;
    }

    @PostMapping
    public AbrigosPublicos criar(@RequestBody AbrigosPublicos abrigosPublicos) {
        return service.salvar(abrigosPublicos);
    }

    @GetMapping
    public List<AbrigosPublicos> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public AbrigosPublicos buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    
    @PutMapping("/{id}")
    public AbrigosPublicos atualizar(@PathVariable Long id, @RequestBody AbrigosPublicos abrigosPublicos) {
        return service.atualizar(id, abrigosPublicos);
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}