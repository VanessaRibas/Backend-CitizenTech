package com.fiap.ec.backend_citizentech.repository;
 
import com.fiap.ec.backend_citizentech.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface AlertaRepository extends JpaRepository<Alerta, Long> {
}