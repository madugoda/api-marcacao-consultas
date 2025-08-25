package com.fiap.ecr.api_marcacao_consultas.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.ecr.api_marcacao_consultas.model.Consulta;

import java.util.List;
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByUsuarioId(Long usuarioId);
}