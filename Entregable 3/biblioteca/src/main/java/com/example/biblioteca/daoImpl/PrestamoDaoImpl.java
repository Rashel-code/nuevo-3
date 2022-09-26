package com.example.biblioteca.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;

import com.example.biblioteca.Constantes;
import com.example.biblioteca.dao.Operaciones;

import com.example.biblioteca.entity.Prestamo;



@Component
public class PrestamoDaoImpl implements Operaciones<Prestamo>{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource dataSource;
	
	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		
		NamedParameterJdbcTemplate named = new NamedParameterJdbcTemplate(dataSource);
		GeneratedKeyHolder llaveRecuperar = new GeneratedKeyHolder();
		
		String query = "INSERT INTO prestamo(fecha_pres, fecha_dev, idempleado, idalumno, estado) VALUES(now(), :fecha_dev, :idempleado, :idalumno, :estado)";
		
		Map<String, Object> map = new HashMap<>();
		map.put("fecha_dev", t.getFecha_dev());
		map.put("idempleado", t.getIdempleado());
		map.put("idalumno", t.getIdalumno());
		map.put("estado", Constantes.PrestamoRealizado);
		
		named.update(query, new MapSqlParameterSource(map), llaveRecuperar);
				

		return llaveRecuperar.getKey().intValue();
	}

	@Override
	public int update(Prestamo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM  WHERE idprestamo = ?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		try {
			Prestamo prest = jdbcTemplate.queryForObject("SELECT * FROM prestamo WHERE idprestamoo=?",
					BeanPropertyRowMapper.newInstance(Prestamo.class), id);
			return prest;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<Prestamo> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from prestamo", BeanPropertyRowMapper.newInstance(Prestamo.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
