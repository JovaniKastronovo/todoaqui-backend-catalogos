package com.ridelnova.todoaquiapp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ridelnova.todoaquiapp.dto.CategoriasDto;
import com.ridelnova.todoaquiapp.service.CategoriasService;

@Component
@RestController
@RequestMapping("/rest/api")
public class TodoAquiController {

	@Autowired
	private CategoriasService categoriasService;

	private static final Logger log = Logger.getLogger(TodoAquiController.class);

	@RequestMapping(value = "/consultaCategorias", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public ResponseEntity<List<CategoriasDto>> entidadCercana() {
		log.info("Procesa categorias");

		List<CategoriasDto> listCategorias = null;

		listCategorias = categoriasService.obtenerCategoriasByStatus();
		if (listCategorias != null) {
			return new ResponseEntity<List<CategoriasDto>>(listCategorias, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<CategoriasDto>>(listCategorias, HttpStatus.NOT_FOUND);
		}

	}

}
