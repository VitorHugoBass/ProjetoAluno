package br.com.vitor.projetoalunojsf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vitor.projetoalunojsf.entities.Turma;


@Repository
public interface TurmaRepository  extends JpaRepository<Turma, Integer>{

}

