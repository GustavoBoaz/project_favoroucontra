package com.farmacia.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.Farmacia.models.Voto;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {
	

}
