package dev.pizzeriaAPI.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.pizzeriaAPI.entite.Pizza;
import dev.pizzeriaAPI.repository.PizzaRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/pizzas")
public class PizzaController {
	@Autowired private PizzaRepository pizzaRepository;
	
	@PostConstruct
	public void init() {
		pizzaRepository.save(new Pizza("Nap", "Napolitaine", 12.00, "Viande"));
	}
	
	@GetMapping
	public List<Pizza> listerPizzas(){
		return this.pizzaRepository.findAll();
	}
	
	@PostMapping
	public Pizza setPizza(@RequestBody Pizza pizza) {
		return this.pizzaRepository.save(pizza);
	}
}
