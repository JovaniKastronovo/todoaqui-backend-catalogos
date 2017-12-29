package com.ridelnova.todoaquiapp.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.ridelnova.todoaquiapp.dto.SubCategoriaDto;
import com.ridelnova.todoaquiapp.utils.SpringJdbc;

/**
 * @author JAarzate
 *
 */
@Repository
public class SubCategoriaDaoImpl extends SpringJdbc implements SubCategoriaDao {

	private String qrySelectSubCategorias = "SELECT * FROM cat_subcategoria WHERE id_categoria = ? "
			+ " AND ESTATUS = TRUE";

	@Override
	public List<SubCategoriaDto> getSubCategoriaByCategoria(Integer idCategoria) {

		return jdbcTemplate.query(qrySelectSubCategorias, new Object[] { idCategoria },
				BeanPropertyRowMapper.newInstance(SubCategoriaDto.class));
	}

}
