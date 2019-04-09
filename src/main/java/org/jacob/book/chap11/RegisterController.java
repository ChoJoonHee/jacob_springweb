package org.jacob.book.chap11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * p.282 [리스트 11.11] 회원가입 컨트롤러
 * 
 * @author Jacob
 */
@Controller
public class RegisterController {

	@Autowired
	MemberDao memberDao;

	static final Logger logger = LogManager.getLogger();

	/**
	 * p.271 [리스트 11.5] handleStep1() 메서드 추가
	 */
	@RequestMapping("/register/step1")
	public String handleStep1() {
		return "register/step1";
	}

	/**
	 * p.276 [리스트 11.8] handleStep2() 메서드 추가
	 */
	@PostMapping("/register/step2")
	public String handleStep2(
			@RequestParam(value = "agree", defaultValue = "false") Boolean agree) {
		if (!agree) // 동의하지 않으면 step1으로 돌아감
			return "register/step1";
		// 동의하면 step2로 forward
		return "register/step2";
	}

	/**
	 * p.280 [리스트 11.10] handleStep2Get() 메서드 추가
	 */
	@GetMapping("/register/step2")
	public String handleStep2Get() {
		return "redirect:/register/step1";
	}

	/**
	 * p.282 [리스트 11.11] handleStep3() 메서드 추가
	 */
	@PostMapping("/register/step3")
	public String handleStep3(RegisterRequest regReq) {
		// 회원정보 저장
		Member member = new Member(regReq.getEmail(), regReq.getPassword(),
				regReq.getName());
		try {
			memberDao.insert(member);
			logger.debug("회원 정보를 저장했습니다. email = {}", member.getEmail());
			return "register/step3";
		} catch (DuplicateKeyException e) {
			logger.debug("이미 존재하는 이메일입니다. email = {}", member.getEmail());
			return "register/step2";
		}
	}
}