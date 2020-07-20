package br.com.vitor.projetoalunojsf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vitor.projetoalunojsf.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
