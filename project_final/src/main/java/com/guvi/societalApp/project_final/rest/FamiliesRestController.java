package com.guvi.societalApp.project_final.rest;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.guvi.societalApp.project_final.dao.FamiliesDAO;
import com.guvi.societalApp.project_final.entity.Families;

import Exception.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FamiliesRestController {
	private FamiliesDAO familiesDAO;

	@Autowired
	public FamiliesRestController(FamiliesDAO theFamiliesDAO) {
		familiesDAO = theFamiliesDAO;
	}

	// To get all the families list
	@GetMapping("/families")
	public List<Families> findAll() {
		return familiesDAO.findAll();
	}

	// To insert a new family into the database
	@PostMapping("/insert")
	public Families create(@RequestBody Families body) {
		return familiesDAO.save(body);
	}

	// To update an existing family
	@PutMapping("/families/{id}")
	public ResponseEntity<Families> updateFamily(@PathVariable int id, @RequestBody Families familyDetails) {
		Families family = familiesDAO.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Family not exist with id :" + id));

		family.setOwner(familyDetails.getOwner());
		family.setEmail(familyDetails.getEmail());
		family.setBuilding(familyDetails.getBuilding());
		family.setOwned(familyDetails.getOwned());

		Families updateFamily = familiesDAO.save(family);
		return ResponseEntity.ok(updateFamily);
	}

	// delete families rest api
	@DeleteMapping("/families/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteFamily(@PathVariable int id) {
		Families family = familiesDAO.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Medicine not exist with id :" + id));

		familiesDAO.delete(family);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	// get families by id rest api
	@GetMapping("/families/{id}")
	public ResponseEntity<Families> getMedicineById(@PathVariable int id) {
		Families family = familiesDAO.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Medicine not exist with id :" + id));
		return ResponseEntity.ok(family);
	}
}
