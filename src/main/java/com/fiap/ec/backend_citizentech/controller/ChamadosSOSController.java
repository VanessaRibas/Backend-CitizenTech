package com.fiap.ec.backend_citizentech.controller;

import com.fiap.ec.backend_citizentech.model.ChamadosSOS;
import com.fiap.ec.backend_citizentech.service.ChamadosSOSService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/chamadosSOS")
@CrossOrigin
public class ChamadosSOSController {

    private final ChamadosSOSService service;

    public ChamadosSOSController(ChamadosSOSService service) {
        this.service = service;
    }

    @PostMapping
    public ChamadosSOS criar(@RequestBody ChamadosSOS chamado) {
        return service.salvar(chamado);
    }

    @GetMapping
    public List<ChamadosSOS> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ChamadosSOS buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    
    @PutMapping("/{id}")
    public ChamadosSOS atualizar(@PathVariable Long id, @RequestBody ChamadosSOS chamado) {
        return service.atualizar(id, chamado);
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}