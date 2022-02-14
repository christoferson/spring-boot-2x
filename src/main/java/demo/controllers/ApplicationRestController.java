package demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApplicationRestController {

	@GetMapping("/info")
	public String index() {
		return String.format("Version:%s ServerTime:%s", "1.0", System.currentTimeMillis());
	}

}
