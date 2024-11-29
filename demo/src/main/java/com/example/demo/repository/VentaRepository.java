package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uptc.edu.co.example.demo.entityes.Book;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {}