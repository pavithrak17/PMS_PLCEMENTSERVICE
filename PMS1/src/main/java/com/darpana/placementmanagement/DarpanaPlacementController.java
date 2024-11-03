package com.darpana.placementmanagement;

import java.util.List;
import java.util.NoSuchElementException;

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
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*", allowCredentials = "true") 
@RestController
public class DarpanaPlacementController {
	
	@Autowired
	private DarpanaPlacementService service;
	
	//creation
	@PostMapping("/Placement")
	public void add(@RequestBody DarpanaPlacement p)
	{
		service.create(p);
	}
	
	//deletion
	@DeleteMapping("/Placement/{id}")
	public void remove (@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//Retrieve data with all details
	@GetMapping("/Placement")
	public List<DarpanaPlacement>list()
	{
		return service.lisAll();
	}
	
	//Retrieve with specific ID
	@GetMapping("/Placement/{id}")
	public ResponseEntity<DarpanaPlacement>get(@PathVariable Integer id)
	{
		try 
		{
		DarpanaPlacement p=service.retrieve(id);
		return new ResponseEntity<DarpanaPlacement>(p,HttpStatus.OK);
		}
		
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<DarpanaPlacement>(HttpStatus.NOT_FOUND);
		}
	}
	
	//update any data
	@PutMapping("/Placement/{id}")
	public ResponseEntity<DarpanaPlacement>update(@RequestBody DarpanaPlacement p, @PathVariable Integer id)
	{
		try 
		{
		@SuppressWarnings("unused")
		DarpanaPlacement p1=service.retrieve(id);
		service.create(p);
		return new ResponseEntity<DarpanaPlacement>(p,HttpStatus.OK);
		}
		
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<DarpanaPlacement>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	
	
}