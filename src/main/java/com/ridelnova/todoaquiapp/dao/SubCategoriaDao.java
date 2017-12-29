package com.ridelnova.todoaquiapp.dao;

import java.util.List;

import com.ridelnova.todoaquiapp.dto.SubCategoriaDto;

/**
 * @author JAarzate
 *
 */
public interface SubCategoriaDao {
	
	/**Metodo utilizado para obtener subcategorias de categorias
	 * @param idCategoria
	 * @return
	 */
	List<SubCategoriaDto> getSubCategoriaByCategoria(Integer idCategoria);
}
