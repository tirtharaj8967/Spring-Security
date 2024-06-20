package com.spring.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@PreAuthorize("hasRole('NORMAL')")
	@GetMapping("/publicHome")
	public String home() {
		return ("<h1>This is a public user</h1>");
	}
	@GetMapping("/admin")
	public String home1() {
		return ("<h1>Welcome Admin</h1>");
	}
	@GetMapping("/user")
	public String home2() {
		return ("<h1>Welcome</h1>");
	}
	@GetMapping("/merchant")
	public String home3() {
		return ("<h1>Welcome</h1>");
	}
}
