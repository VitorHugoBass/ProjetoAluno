package br.com.vitor.projetoalunojsf.services;

import java.util.List;
import java.util.Optional;

import br.com.vitor.projetoalunojsf.entities.Aluno;


public interface IAlunoService {

	Aluno save(Aluno Aluno);

	Aluno update(Aluno Aluno);

	Aluno delete(Integer id);

	List<Aluno> findAll();

	Optional<Aluno> findById(Integer id);

	// Page<Aluno> findAll(Pageable pageable, Example<Aluno> where);
}
