package br.com.vitor.projetoalunojsf.services;

import java.util.List;
import java.util.Optional;

import br.com.vitor.projetoalunojsf.entities.Turma;


public interface ITurmaService {
	Turma save(Turma Turma);

	Turma update(Turma Turma);

	Turma delete(Integer id);

	List<Turma> findAll();

	Optional<Turma> findById(Integer id);

	// Page<Turma> findAll(Pageable pageable, Example<Turma> where);
}
