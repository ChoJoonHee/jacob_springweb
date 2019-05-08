package org.jacob.book.chap11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * p.269 Default controller for empty method
 * 
 * @author Jacob
 */
@Controller
public class DefaultController {

	static final Logger logger = LogManager.getLogger();

	@RequestMapping("/**")
	public void defaultMapping() {
		logger.debug("Default mapping");
	}
}
