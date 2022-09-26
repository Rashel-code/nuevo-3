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
public class Empleado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idempleado;
	private String usuario;
	private String clave;
	private int estado;
	
	public Empleado() {
		super();
	}

	public Empleado(int idempleado, String usuario, String clave, int estado) {
		super();
		this.idempleado = idempleado;
		this.usuario = usuario;
		this.clave = clave;
		this.estado = estado;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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
