package com.rentmate.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@RestController
public class BackendApplication {

	/**
	 * Returns the static file located at src/main/resources/static/features.html.
	 * If the file doesn't exist, responds with 404 Not Found.
	 */
	@GetMapping("/features")
	public ResponseEntity<Resource> exampleEndpoint() {
		Resource resource = new ClassPathResource("static/features.html");
		if (!resource.exists()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok()
				.contentType(MediaType.TEXT_HTML)
				.body(resource);
	}
	@GetMapping("/listings")
	public ResponseEntity<Resource> listingsEndpoint() {
		Resource resource = new ClassPathResource("static/listings.html");
		if (!resource.exists()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok()
				.contentType(MediaType.TEXT_HTML)
				.body(resource);
	}
	@GetMapping("/contact")
	public ResponseEntity<Resource> contactEndpoint() {
		Resource resource = new ClassPathResource("static/contact.html");
		if (!resource.exists()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok()
				.contentType(MediaType.TEXT_HTML)
				.body(resource);
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
