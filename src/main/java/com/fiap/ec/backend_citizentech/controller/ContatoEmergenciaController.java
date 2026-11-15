package com.fiap.ec.backend_citizentech.controller; 
import com.fiap.ec.backend_citizentech.model.ContatoEmergencia;
import com.fiap.ec.backend_citizentech.service.ContatoEmergenciasService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
 
@RestController

@RequestMapping("/contatoEmergencia")

@CrossOrigin

public class ContatoEmergenciaController {
 
    private final ContatoEmergenciasService service;
 
    public ContatoEmergenciaController(ContatoEmergenciasService service) {

        this.service = service;

    }
 
    @PostMapping

    public ContatoEmergencia criar(@RequestBody ContatoEmergencia contatoEmergencia) {

        return service.salvar(contatoEmergencia);

    }
 
    @GetMapping

    public List<ContatoEmergencia> listar() {

        return service.listar();

    }
 
    @GetMapping("/{id}")

    public ContatoEmergencia buscarPorId(@PathVariable Long id) {

        return service.buscarPorId(id);

    }
    @PutMapping("/{id}")

    public ContatoEmergencia atualizar(@PathVariable Long id, @RequestBody ContatoEmergencia contatoEmergencia) {

        return service.atualizar(id, contatoEmergencia);

    }
    
    @DeleteMapping("/{id}")

    public void deletar(@PathVariable Long id) {

        service.deletar(id);

    }
 

}
 