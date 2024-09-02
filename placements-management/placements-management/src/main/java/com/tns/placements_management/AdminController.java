package com.tns.placements_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController

public class AdminController
{
	@Autowired
	private PlacementService place;
	@GetMapping("/Placement")
	public List<Placement> list()
	{
		return place.listAll();
	}
	@PostMapping("/Placement")
	public void add(@RequestBody Placement place1) 
	{
		place.save(place1);
	}
	@GetMapping("/Placement/{id}")
	public ResponseEntity<Placement> get(@PathVariable Integer id)
	{
		try
		{
			Placement c=place.get(id);
		return new ResponseEntity<Placement>(c,HttpStatus.OK);
	    }
		catch(NoResultException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/Placement/{id}")
	public void delete(@PathVariable Integer id)
	{
		place.delete(id);
	}
	@PutMapping("/Placement/{id}")
	public ResponseEntity<Placement> update(@PathVariable Integer id,@RequestBody Placement update_c)
	{
		try
		{
			Placement exist_c=place.get(id);
		exist_c.setName(update_c.getName());
		exist_c.setCourse(update_c.getCourse());
		exist_c.setEmail(update_c.getEmail());
		place.update(exist_c);
		return new ResponseEntity<Placement>(exist_c,HttpStatus.OK);
	    }
		catch(NoResultException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
}