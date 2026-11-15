package com.fiap.ec.backend_citizentech.repository;
 
import com.fiap.ec.backend_citizentech.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}