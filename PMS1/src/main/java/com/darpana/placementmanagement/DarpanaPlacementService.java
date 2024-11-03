package com.darpana.placementmanagement;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DarpanaPlacementService  {
	
	@Autowired
	private DarpanaPlacementRespository repo;
	
	//To retrieve all the data for Placement Class
	public List<DarpanaPlacement> lisAll()
	{
		return repo.findAll();
	}
	
	//insert or create a data
	public void create(DarpanaPlacement p)
	{
		repo.save(p);
	}
	
	//To retrieve a single record
	public DarpanaPlacement retrieve(Integer id)
	{
		return repo.findById(id).get();
	}

	//To delete data from database
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}