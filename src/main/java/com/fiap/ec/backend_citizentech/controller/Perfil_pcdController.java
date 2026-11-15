package com.fiap.ec.backend_citizentech.controller; 
import com.fiap.ec.backend_citizentech.model.Perfil_pcd;
import com.fiap.ec.backend_citizentech.service.Perfil_pcdService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
 
@RestController

@RequestMapping("/perfil_pcd")

@CrossOrigin

public class Perfil_pcdController {
 
    private final Perfil_pcdService service;
 
    public Perfil_pcdController(Perfil_pcdService service) {

        this.service = service;

    }
 
    @PostMapping

    public Perfil_pcd criar(@RequestBody Perfil_pcd perfil_pcd) {

        return service.salvar(perfil_pcd);

    }
 
    @GetMapping

    public List<Perfil_pcd> listar() {

        return service.listar();

    }
 
    @GetMapping("/{id}")

    public Perfil_pcd buscarPorId(@PathVariable Long id) {

        return service.buscarPorId(id);

    }
    @PutMapping("/{id}")

    public Perfil_pcd atualizar(@PathVariable Long id, @RequestBody Perfil_pcd perfil_pcd) {

        return service.atualizar(id, perfil_pcd);

    }
    
    @DeleteMapping("/{id}")

    public void deletar(@PathVariable Long id) {

        service.deletar(id);

    }
 

}
 