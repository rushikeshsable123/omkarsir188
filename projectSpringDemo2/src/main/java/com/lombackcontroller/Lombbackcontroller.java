package com.lombackcontroller;

import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.SneakyThrows;

@RestController
public class Lombbackcontroller {
	
	private static final Logger log = LoggerFactory.getLogger(Lombbackcontroller.class);
	
	@GetMapping("/name/{name}")
	public void m1(@PathVariable("name") String name)
	{
		log.info(name);
	}
	@RequestMapping("/sneaky")
	@SneakyThrows
	public void m2()
	{
		DriverManager.getConnection(null, null, null);
	}

	public void m3()
	{
		DriverManager.getConnection(null, null, null);
	}

}
