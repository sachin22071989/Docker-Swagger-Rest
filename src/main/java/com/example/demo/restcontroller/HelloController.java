/**
 * 
 */
package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sachin
 *
 */

@RestController
@RequestMapping("/rest")
public class HelloController {
	
	@GetMapping("/gethello")
	public String getHello() {
		
		return "Its me Hello";
	}

	@PutMapping("/puthello")
	public String putHello() {
		
		return "Its me Hello";
	}
}
