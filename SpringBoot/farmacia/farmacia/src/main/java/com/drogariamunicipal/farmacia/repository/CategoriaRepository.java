package com.drogariamunicipal.farmacia.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<com.drogariamunicipal.farmacia.model.Categoria, Long> {

	public List<com.drogariamunicipal.farmacia.model.Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}
