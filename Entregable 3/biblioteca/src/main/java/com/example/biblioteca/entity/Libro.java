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

public class Libro implements Serializable {

private static final long serialVersionUID = 1L;
	
	private int idlibro;
	private String nombre;
	private String autor;
	private String editorial;
	private int estado;
	
	public Libro() {
		super();
	}

	public Libro(int idlibro, String nombre, String autor, String editorial, int estado) {
		super();
		this.idlibro = idlibro;
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.estado = estado;
	}

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
