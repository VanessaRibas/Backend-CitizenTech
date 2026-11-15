package com.fiap.ec.backend_citizentech.controller; 
import com.fiap.ec.backend_citizentech.model.LocaisSeguros;
import com.fiap.ec.backend_citizentech.service.LocaisSegurosService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
 
@RestController

@RequestMapping("/locaisSeguros")

@CrossOrigin

public class LocaisSegurosController {
 
    private final LocaisSegurosService service;
 
    public LocaisSegurosController(LocaisSegurosService service) {

        this.service = service;

    }
 
    @PostMapping

    public LocaisSeguros criar(@RequestBody LocaisSeguros locaisSeguros) {

        return service.salvar(locaisSeguros);

    }
 
    @GetMapping

    public List<LocaisSeguros> listar() {

        return service.listar();

    }
 
    @GetMapping("/{id}")

    public LocaisSeguros buscarPorId(@PathVariable Long id) {

        return service.buscarPorId(id);

    }
    @PutMapping("/{id}")

    public LocaisSeguros atualizar(@PathVariable Long id, @RequestBody LocaisSeguros locaisSeguros) {

        return service.atualizar(id, locaisSeguros);

    }
    
    @DeleteMapping("/{id}")

    public void deletar(@PathVariable Long id) {

        service.deletar(id);

    }
 

}
 