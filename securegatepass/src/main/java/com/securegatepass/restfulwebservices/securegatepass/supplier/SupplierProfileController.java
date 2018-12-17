package com.securegatepass.restfulwebservices.securegatepass.supplier;


import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.securegatepass.restfulwebservices.securegatepass.supplier.SupplierProfile;
import com.securegatepass.restfulwebservices.securegatepass.supplier.SupplierProfileDaoService;





@RestController


public class SupplierProfileController {

	public SupplierProfileController() {

	}


	@Autowired
	private SupplierProfileDaoService service;
	//retrieveAllSuppliers

	@GetMapping(path = "/suppliers")
	public List<SupplierProfile> getAllSuppliers(){

		return service.getAllSuppliers();
	}

	@GetMapping(path = "/suppliers/{id}")

	public SupplierProfile searchSupplier(@PathVariable int id){
		SupplierProfile supplier = service.searchSupplier(id);

		return supplier;


	}

	@PostMapping(path ="/suppliers")

	public ResponseEntity<Object> saveSupplier(@RequestBody SupplierProfile supplier) {
		SupplierProfile savedSupplier = service.saveSupplier(supplier);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedSupplier.getSID()).toUri();

		return ResponseEntity.created(location).build();
	}

}
