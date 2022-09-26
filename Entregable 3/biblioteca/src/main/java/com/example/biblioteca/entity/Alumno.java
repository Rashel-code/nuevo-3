package com.example.biblioteca.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Alumno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idalumno;
	private String codigo;
	private String nombre ;
	private String apellido;
	
	

	public Alumno() {
		super();
	}

	public Alumno(int idalumno, String codigo, String nombre, String apellido) {
		super();
		this.idalumno = idalumno;
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
	
	
}
