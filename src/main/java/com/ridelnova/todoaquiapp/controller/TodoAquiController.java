package com.ridelnova.todoaquiapp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ridelnova.todoaquiapp.dto.CategoriasDto;
import com.ridelnova.todoaquiapp.dto.SubCategoriaDto;
import com.ridelnova.todoaquiapp.service.CategoriasService;
import com.ridelnova.todoaquiapp.service.SubCategoriaService;

@Component
@RestController
@RequestMapping("/rest/api")
public class TodoAquiController {

	private static final Logger log = Logger.getLogger(TodoAquiController.class);
	
	@Autowired
	private CategoriasService categoriasService;
	@Autowired
	private SubCategoriaService subCategoriaService;
	

	@RequestMapping(value = "/consultaCategorias", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public ResponseEntity<List<CategoriasDto>> getCategorias() {
		log.info(">>>getCategorias()<<<");

		List<CategoriasDto> listCategorias = null;

		listCategorias = categoriasService.obtenerCategoriasByStatus();
		if (listCategorias != null) {
			return new ResponseEntity<List<CategoriasDto>>(listCategorias, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<CategoriasDto>>(listCategorias, HttpStatus.NOT_FOUND);
		}

	}

	@RequestMapping(value = "/consultaSuCategorias", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<List<SubCategoriaDto>> getSubCategorias(@RequestBody CategoriasDto categoriasDto) {
		log.info(">>>getSubCategorias<<<");
		
		SubCategoriaDto suCategoriaDto = new SubCategoriaDto();
		suCategoriaDto.setIdCategoria(categoriasDto.getIdCategoria());
		List<SubCategoriaDto> listSubcategorias = subCategoriaService.getSubCategoriaByCategoria(suCategoriaDto);
		if (listSubcategorias.size() > 0) {
			return new ResponseEntity<List<SubCategoriaDto>>(listSubcategorias, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<SubCategoriaDto>>(listSubcategorias, HttpStatus.NOT_FOUND);
		}

	}
}
