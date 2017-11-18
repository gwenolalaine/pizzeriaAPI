package dev.pizzeriaAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.pizzeriaAPI.entite.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{
	public Pizza findByCode(String code);
}
