package com.blog.App.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String titulo;

	@NotNull
	private String descricao;

	@OneToMany()
	@JoinColumn(name = "postId", nullable = true)
	@JsonIgnoreProperties("posts")
	private List<Voto> votos;

	public Post() {
	}

	public Post(Long id, @NotNull String titulo, @NotNull String descricao, List<Voto> votos) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.votos = votos;
	}

	public Long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getTitulo() {
		return titulo;
	}
	public List<Voto> getVotos() {
		return votos;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}

}
