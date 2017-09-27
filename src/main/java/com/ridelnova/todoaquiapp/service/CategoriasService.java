package com.ridelnova.todoaquiapp.service;

import java.util.List;

import com.ridelnova.todoaquiapp.dto.CategoriasDto;

public interface CategoriasService {

	List<CategoriasDto> obtenerCategoriasByStatus();

}
