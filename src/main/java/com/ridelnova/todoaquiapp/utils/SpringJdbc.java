package com.ridelnova.todoaquiapp.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbc {

	@Autowired
	public JdbcTemplate jdbcTemplate;
}
