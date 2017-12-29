package com.ridelnova.todoaquiapp.service;

import java.util.List;

import com.ridelnova.todoaquiapp.dto.SubCategoriaDto;

/**
 * @author JAarzate
 *
 */
public interface SubCategoriaService {
	
	/**
	 * @param subCategoriaDto
	 * @return
	 */
	List<SubCategoriaDto> getSubCategoriaByCategoria(SubCategoriaDto subCategoriaDto);
}
