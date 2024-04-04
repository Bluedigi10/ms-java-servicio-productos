package com.bluedigi.microservices.productos.models.service;

import java.util.List;

import com.bluedigi.microservices.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
}
