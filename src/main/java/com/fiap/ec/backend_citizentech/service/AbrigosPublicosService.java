package com.fiap.ec.backend_citizentech.service;

import com.fiap.ec.backend_citizentech.model.AbrigosPublicos;
import com.fiap.ec.backend_citizentech.repository.AbrigosPublicosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbrigosPublicosService {

    private final AbrigosPublicosRepository repository;

    public AbrigosPublicosService(AbrigosPublicosRepository repository) {
        this.repository = repository;
    }

    public AbrigosPublicos salvar(AbrigosPublicos abrigo) {
        return repository.save(abrigo);
    }

    public List<AbrigosPublicos> listar() {
        return repository.findAll();
    }

    public AbrigosPublicos buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Abrigo público não encontrado"));
    }

    public AbrigosPublicos atualizar(Long id, AbrigosPublicos abrigoAtualizado) {
        AbrigosPublicos abrigoExistente = buscarPorId(id);
        abrigoExistente.setNome(abrigoAtualizado.getNome());
        abrigoExistente.setEndereco(abrigoAtualizado.getEndereco());
        abrigoExistente.setLatitude(abrigoAtualizado.getLatitude());
        abrigoExistente.setLongitude(abrigoAtualizado.getLongitude());
        abrigoExistente.setTemRampa(abrigoAtualizado.getTemRampa());
        abrigoExistente.setTemElevador(abrigoAtualizado.getTemElevador());
        abrigoExistente.setStatus(abrigoAtualizado.getStatus());
        abrigoExistente.setCapacidadeAtual(abrigoAtualizado.getCapacidadeAtual());
        abrigoExistente.setCapacidadeMaxima(abrigoAtualizado.getCapacidadeMaxima());
        return repository.save(abrigoExistente);
    }

    public void deletar(Long id) {
        repository.delete(buscarPorId(id));
    }
}