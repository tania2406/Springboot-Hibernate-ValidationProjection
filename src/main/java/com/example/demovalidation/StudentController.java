package com.example.demovalidation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	@Autowired
	StudentRepository erepo;
	@RequestMapping("/test")
	public String test()
	{
		return "this is test for demovalidation";
	}
	@RequestMapping("/save")
	public String save(@Valid@RequestBody Student std)
	{
		erepo.save(std);
		return "data has been saved";
		
	}
	@GetMapping("/all")
	public List<Student> findAll()
	{
		return erepo.findAll();
	}
	
}
