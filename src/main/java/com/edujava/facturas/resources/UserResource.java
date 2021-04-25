package com.edujava.facturas.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edujava.facturas.entitis.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//--Método Buscar Todos--//
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u1 = new User(1L, "Eduardo", "edumeru46@gmail,co", "5677", "123");
		return ResponseEntity.ok().body(u1);
	}
	
}
