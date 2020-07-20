package br.com.vitor.projetoalunojsf.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.vitor.projetoalunojsf.entities.Aluno;
import br.com.vitor.projetoalunojsf.repositories.AlunoRepository;
import br.com.vitor.projetoalunojsf.services.IAlunoService;
import br.edu.utfpr.vinicius.projetojsf.entities.Livro;

@Service
public class AlunoService implements IAlunoService{
	
	private final AlunoRepository repository;

	public AlunoService(AlunoRepository repository) {
		this.repository = repository;
	}

	@Override
	public Aluno save(Aluno aluno) {
		repository.save(aluno); 
		return aluno;
	}

	@Override
	public Aluno update(Aluno aluno) {
		repository.save(aluno); 
		return aluno;
	}

	@Override
	public Aluno delete(Integer id) {
		Aluno aluno = Aluno.builder().codAluno(id).build();
		repository.delete(aluno);
		return aluno;
	}

	@Override
	public List<Aluno> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Aluno> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
