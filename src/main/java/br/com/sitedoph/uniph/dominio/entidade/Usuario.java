package br.com.sitedoph.uniph.dominio.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIOS")
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name = "CODIGO")
	private Long id;

	@Column(name = "NOME_COMPLETO")
	private String nomeCompleto;

	@Column(name = "LOGIN")
	private String Login;
	
	@Column(name = "SENHA")
	private String senha;

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

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
