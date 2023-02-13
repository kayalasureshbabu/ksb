package com.example.securies.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
	
	@GetMapping("hello")
	@PreAuthorize("hasRole('USER')")
	public String hello() {
		return "Hello Hi ";
	}
	
	@GetMapping("hello2")
	@PreAuthorize("hassRole('manager')")
	public String hello2() {
		return "hello2";
	}
	
	@GetMapping("hello3")
	@PreAuthorize("hassRole('Admin')")
	public String hello3() {
		return "hello3";
	}
	
	@GetMapping("hello4")
	@PreAuthorize("hassRole('sale')")
	
		public String hello4() {
		return"hello4";
	}

}
