package com.blog.App.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "votos")
public class Voto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String descricao;

	@OneToOne(mappedBy = "post", fetch = FetchType.EAGER)
	@JsonIgnoreProperties("post")
	@Column(nullable = true)
	private Post post;

	public Voto() {
	}

	public Voto(Long id, @NotNull String descricao, Post post) {
		this.id = id;
		this.descricao = descricao;
		this.post = post;
	}

	public Long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public Post getPost() {
		return post;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPost(Post post) {
		this.post = post;
	}
}
