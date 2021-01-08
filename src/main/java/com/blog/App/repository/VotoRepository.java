package com.blog.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.App.models.Voto;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {
	

}
