package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController
{
	@GetMapping("/")
public ResponseEntity< String> getWelcomeMsg() 
{
	
	
	String msg="Srinu bellamkonda";
	return new ResponseEntity<String> (msg,  HttpStatus.CREATED) ;
			
			
}
	@PostMapping("/")
	public String getPostmethod() 
	{
		String  rrr=" bellamkonda mangamma";
		
		return rrr;
	}
	@PutMapping("/")
	public int getPut() {
		int a=11;
		return a;
	}
}
