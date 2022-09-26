package com.example.biblioteca.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Prestamo implements Serializable {

private static final long serialVersionUID = 1L;
	
	private int idprestamo;
	private Date fecha_pres;
	private Date fecha_dev;
	private int estado;
	
	private int idempleado;
	private int idalumno;
	
	private List<Detalle> detalles;
	
	public Prestamo() {
		super();
	}

	public Prestamo(int idprestamo, Date fecha_pres, Date fecha_dev, int estado, int idempleado, int idalumno) {
		super();
		this.idprestamo = idprestamo;
		this.fecha_pres = fecha_pres;
		this.fecha_dev = fecha_dev;
		this.estado = estado;
		this.idempleado = idempleado;
		this.idalumno = idalumno;
	}

	public int getIdprestamo() {
		return idprestamo;
	}

	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}

	public Date getFecha_pres() {
		return fecha_pres;
	}

	public void setFecha_pres(Date fecha_pres) {
		this.fecha_pres = fecha_pres;
	}

	public Date getFecha_dev() {
		return fecha_dev;
	}

	public void setFecha_dev(Date fecha_dev) {
		this.fecha_dev = fecha_dev;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
}
