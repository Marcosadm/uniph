package br.com.sitedoph.uniph.dominio.entidade;

public class Disciplina {

	private long id
	private String descricao
	private String professor
	private String cargahoraria
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	
	
}
