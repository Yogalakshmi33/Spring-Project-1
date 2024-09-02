package com.tns.placements_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService 
{
	@Autowired
	private PlacementRepository repo;
	
	public List<Placement> listAll()
	{
		return repo.findAll();
	}
	public void save(Placement place)
	{
		repo.save(place);
	}
	public Placement get(Integer id)
	{
		return repo.findById(id).get();
	}
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	public void update(Placement place)
	{
		repo.save(place);
	}
	
	
}