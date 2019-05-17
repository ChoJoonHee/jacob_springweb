package org.jacob.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	Logger logger = LogManager.getLogger();

	// http://localhost:8080/springweb/app/x
	@RequestMapping("/x")
	public String x(@RequestParam("title") String title) {
		logger.debug(title);
		// forward: /WEB-INF/jsp/test/a.jsp
		return "test/c";
	}

	@GetMapping("/y")
	public String y(@RequestParam("title") String title) {
		logger.debug(title);
		// redirect: http://localhost:8080/springweb/app/
		return "redirect:/app/c";
	}

	@GetMapping("/c")
	public String c() {
		return "test/c";
	}

	@GetMapping("/form")
	public String form() {
		return "test/form";
	}
}
