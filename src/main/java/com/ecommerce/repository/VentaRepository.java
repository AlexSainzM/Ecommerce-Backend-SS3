package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
	

}
