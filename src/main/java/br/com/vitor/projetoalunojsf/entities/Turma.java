package br.com.vitor.projetoalunojsf.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "turma")
public class Turma {

	@Id
	@Column(name = "codTurma")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codTurma;

	@Column(name = "nomeTurma")
	private String nomeTurma;

}
