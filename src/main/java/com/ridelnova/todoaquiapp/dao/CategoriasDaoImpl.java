package com.ridelnova.todoaquiapp.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.ridelnova.todoaquiapp.dto.CategoriasDto;
import com.ridelnova.todoaquiapp.utils.SpringJdbc;

@Repository
public class CategoriasDaoImpl extends SpringJdbc implements CategoriasDao {

	private String qrySelectCategorias = "SELECT * FROM CAT_CATEGORIAS" + " WHERE ESTATUS = TRUE";

	@Override
	public List<CategoriasDto> consultarCategoriasByStatus() {
		return jdbcTemplate.query(qrySelectCategorias, BeanPropertyRowMapper.newInstance(CategoriasDto.class));
	}

}
