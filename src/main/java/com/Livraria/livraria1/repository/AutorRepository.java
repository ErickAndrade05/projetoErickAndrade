package com.Livraria.livraria1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Livraria.livraria1.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor,Long> {
	
}