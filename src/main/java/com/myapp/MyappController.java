package com.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyappController {
	@GetMapping("name")
public String getname() {
	return "chandru";
}
	

}
