package com.ridelnova.todoaquiapp.dao;

import java.util.List;

import com.ridelnova.todoaquiapp.dto.CategoriasDto;

public interface CategoriasDao {
	
	public List<CategoriasDto> consultarCategoriasByStatus();
	
}
