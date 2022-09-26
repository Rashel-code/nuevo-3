package com.example.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.biblioteca.dao.Operaciones;
import com.example.biblioteca.entity.Empleado;

@Component
public class EmpleadoDaoImpl  implements Operaciones<Empleado>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Empleado t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Empleado t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Empleado read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
