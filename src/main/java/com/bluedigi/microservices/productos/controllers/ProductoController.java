package com.bluedigi.microservices.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bluedigi.microservices.productos.models.entity.Producto;
import com.bluedigi.microservices.productos.models.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService producto;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return producto.findAll();
	}
	
	@GetMapping("/detalle/{id}")
	public Producto detalle(@PathVariable Long id) {
		return producto.findById(id);
	}
}
