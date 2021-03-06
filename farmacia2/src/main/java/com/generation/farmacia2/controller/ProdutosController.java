package com.generation.farmacia2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmacia2.model.Produtos;
import com.generation.farmacia2.repository.ProdutosRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")

public class ProdutosController {

	@Autowired
	private ProdutosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produtos>>GetAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	@PostMapping
	public ResponseEntity<Produtos> post (@RequestBody Produtos produtos){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produtos));
		
	}
	
	@PutMapping
	public ResponseEntity<Produtos> put (@RequestBody Produtos produtos){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produtos));
		
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
		
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produtos>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	
	}
	
	
	}
