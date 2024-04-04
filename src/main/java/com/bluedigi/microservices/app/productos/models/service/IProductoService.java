package com.bluedigi.microservices.app.productos.models.service;

import java.util.List;

import com.bluedigi.microservices.app.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
}
