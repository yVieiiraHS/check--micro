package br.com.fiap.checkpoint1.repository;

import br.com.fiap.checkpoint1.model.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregadosRepository extends JpaRepository<Empregado, Long> {}
