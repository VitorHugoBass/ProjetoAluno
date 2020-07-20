package br.com.vitor.projetoalunojsf.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Builder
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "aluno")
public class Aluno {
	
	@Column(name = "idAluno")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idAluno;
	
	@Column(name = "nomeAluno")
	private String nomeAluno;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "dtNascimento")
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;
	
	@JoinColumn(name = "codTurma")
	@OneToOne
	private Turma turma;
	

}
