package com.example.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.Constantes;
import com.example.biblioteca.entity.Prestamo;
import com.example.biblioteca.service.PrestamoService;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoController {
	
	
	@Autowired
	private PrestamoService prestamoService;
	
	
	@PostMapping("/crear")
	public ResponseEntity<?> prestar(@RequestBody Prestamo prestamo) {
		
		int idCreadoPorBD = 0;
		
		// No mas de dos libros
		if (prestamo.getDetalles().size() > Constantes.LibrosMax) {
			return new ResponseEntity<String>("El limite 2 libros!", HttpStatus.BAD_REQUEST);
		}
		
		try {
			// prestamo
			idCreadoPorBD = prestamoService.create(prestamo);			
		} catch (Exception e) {
			return new ResponseEntity<String>("Error de solicitud " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		
		
		prestamo.setIdprestamo(idCreadoPorBD);
		
		return new ResponseEntity<Prestamo>(prestamo, HttpStatus.CREATED);
		
	}

	

	
}
