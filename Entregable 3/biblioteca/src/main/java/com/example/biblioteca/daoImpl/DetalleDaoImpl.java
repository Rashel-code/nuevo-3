package com.example.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.biblioteca.Constantes;
import com.example.biblioteca.dao.Operaciones;
import com.example.biblioteca.entity.Detalle;

@Component
public class DetalleDaoImpl implements Operaciones<Detalle>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO detalle(idlibro, idprestamo, estado) VALUES(?,?,?)";
		return jdbcTemplate.update(SQL, t.getIdlibro(), t.getIdprestamo(),t.getEstado(), Constantes.PrestamoRealizado);
	}
	

	@Override
	public int update(Detalle t) {
		// TODO Auto-generated method stub
		String SQL = "Update detalle SET estado = ? WHERE (iddetalle= ?)";
		return jdbcTemplate.update(SQL, t.getEstado(), t.getIddetalle());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM WHERE iddetalle = ?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Detalle read(int id) {
		// TODO Auto-generated method stub
		try {
			Detalle det = jdbcTemplate.queryForObject("SELECT * FROM detalle WHERE iddetalle =?", BeanPropertyRowMapper.newInstance(Detalle.class),id);
		return det;
		}catch(IncorrectResultSizeDataAccessException e) {
		return null;
		}
	}

	@Override
	public List<Detalle> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELCT * from detalle", BeanPropertyRowMapper.newInstance(Detalle.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
	
		
		return null;
	}
	
	
	
	
	
	
	
}
