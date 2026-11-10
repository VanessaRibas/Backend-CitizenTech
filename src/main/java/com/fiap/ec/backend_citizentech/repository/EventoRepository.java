package com.fiap.ec.backend_citizentech.repository;

import com.fiap.ec.backend_citizentech.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}