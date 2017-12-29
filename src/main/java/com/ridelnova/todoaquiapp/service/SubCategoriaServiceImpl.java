package com.ridelnova.todoaquiapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ridelnova.todoaquiapp.dao.SubCategoriaDao;
import com.ridelnova.todoaquiapp.dto.SubCategoriaDto;

/**
 * @author JAarzate
 *
 */
@Service
public class SubCategoriaServiceImpl implements SubCategoriaService {

	@Autowired
	private SubCategoriaDao subCategoriaDao;

	/* (non-Javadoc)
	 * @see com.ridelnova.todoaquiapp.service.SubCategoriaService#getSubCategoriaByCategoria(com.ridelnova.todoaquiapp.dto.SubCategoriaDto)
	 */
	@Override
	public List<SubCategoriaDto> getSubCategoriaByCategoria(SubCategoriaDto subCategoriaDto) {

		return subCategoriaDao.getSubCategoriaByCategoria(subCategoriaDto.getIdCategoria());
	}

}
