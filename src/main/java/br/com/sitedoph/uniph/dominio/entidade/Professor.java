package br.com.sitedoph.uniph.dominio.entidade;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_PROFESSOR")
public class Professor {

	@Id
	@GeneratedValue
	@Column (name = "MATRICULA")
	private Long Id;
	
	@Column(name = "NOME_COMPLETO")
	private String nomeCompleto;
	@Column(name = "CPF")
	private String cpf;

	@Column(name = "DT_CADASTRO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar datadeCadastro;

	@Column(name = "TELEFONE")
	private String telefone;
	@Column(name = "email")
	private String email;

	@Column(name = "CURRICULO")
	private String Curriculo;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDatadeCadastro() {
		return datadeCadastro;
	}

	public void setDatadeCadastro(Calendar datadeCadastro) {
		this.datadeCadastro = datadeCadastro;
	}

	public String getCurriculo() {
		return Curriculo;
	}

	public void setCurriculo(String curriculo) {
		Curriculo = curriculo;
	}

}
