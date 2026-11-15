package com.fiap.ec.backend_citizentech.service;

import com.fiap.ec.backend_citizentech.model.Usuario;
import com.fiap.ec.backend_citizentech.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
    
    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        Usuario usuarioExistente = buscarPorId(id);
    
        usuarioExistente.setNome(usuarioAtualizado.getNome());
        usuarioExistente.setEmail(usuarioAtualizado.getEmail());
        usuarioExistente.setSenhaHash(usuarioAtualizado.getSenhaHash());
        usuarioExistente.setTipoPerfil(usuarioAtualizado.getTipoPerfil());
        usuarioExistente.setCriado_em(usuarioAtualizado.getCriado_em());
    
        return repository.save(usuarioExistente);
    }
    
    public void deletar(Long id) {
        Usuario usuario = buscarPorId(id);
        repository.delete(usuario);
    }
}