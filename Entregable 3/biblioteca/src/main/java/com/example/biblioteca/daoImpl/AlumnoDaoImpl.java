package com.example.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.biblioteca.dao.Operaciones;
import com.example.biblioteca.entity.Alumno;



@Component
public class AlumnoDaoImpl implements Operaciones<Alumno> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Alumno t) {
		// TODO Auto-generated method stub
		
		String SQL = "INSERT INTO alumno (idalumno, codigo, nombre, apellido) VALUES (?,?,?,?)";
		return jdbcTemplate.update(SQL, t.getIdalumno(), t.getCodigo(), t.getNombre(), t.getApellido()  );
	}

	@Override
	public int update(Alumno t) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM  WHERE idlibro = ?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		try {
			Alumno alum = jdbcTemplate.queryForObject("SELECT * FROM alumno WHERE idalumno=?",
					BeanPropertyRowMapper.newInstance(Alumno.class), id);
			return alum;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<Alumno> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from alumno", BeanPropertyRowMapper.newInstance(Alumno.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
