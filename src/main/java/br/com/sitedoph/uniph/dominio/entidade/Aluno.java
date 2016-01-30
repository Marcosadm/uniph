package br.com.sitedoph.uniph.dominio.entidade;

import java.util.Calendar;

@Entity
@table(name = "TB_ALUNO")
public class Aluno {


	@Column (name = "id")
	private Long id;
	@Column(name = "nomeCompleto")
	private String nomeCompleto;
	@Column(name = "RG")
	private String rg;
	@Column(name = "CPF")
	private String cpf;

	private Calendar datadeNascimento;

	@Column(name = "telefone")
	private String telefone;
	@Column(name = "email")
	private String email;
	@Column (name = "dataDeCadastro")
	private Calendar dataDeCadastro

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDatadeNascimento() {
		return datadeNascimento;
	}

	public void setDatadeNascimento(Calendar datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(Calendar dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
}
