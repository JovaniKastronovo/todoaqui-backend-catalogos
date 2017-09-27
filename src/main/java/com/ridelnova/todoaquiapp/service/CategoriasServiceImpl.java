package com.ridelnova.todoaquiapp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ridelnova.todoaquiapp.dao.CategoriasDao;
import com.ridelnova.todoaquiapp.dto.CategoriasDto;

@Service
public class CategoriasServiceImpl implements CategoriasService {

	private static final Logger log = Logger.getLogger(CategoriasServiceImpl.class);

	@Autowired
	CategoriasDao categoriasDao;

	@Override
	public List<CategoriasDto> obtenerCategoriasByStatus() {
		log.info("Obteniendo catagorias");

		return categoriasDao.consultarCategoriasByStatus();
	}

}
