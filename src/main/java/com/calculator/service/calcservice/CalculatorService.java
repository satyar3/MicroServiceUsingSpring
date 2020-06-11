package com.calculator.service.calcservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService
{
	@GetMapping("/add/{x}/{y}")
	public Response add(@PathVariable int x, @PathVariable int y)
	{
		 Response res = new Response(x, y, x+y);
		return res;
	}
	
	//Usage:
	//http://localhost:6256/add/10/30
	
	@GetMapping("/subtraction/{x}/{y}")
	public Response subtraction(@PathVariable int x, @PathVariable int y)
	{
		 Response res = new Response(x, y, x-y);
		return res;
	}
	
	//Usage:
	//http://localhost:6256/subtraction/50/30
}
