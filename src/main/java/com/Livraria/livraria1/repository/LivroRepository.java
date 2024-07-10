package com.Livraria.livraria1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Livraria.livraria1.entities.Livro;


@Repository
public interface LivroRepository extends JpaRepository<Livro,Long> {
	
}