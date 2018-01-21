package cn.njnode.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

	private Logger log = Logger.getLogger(LoginController.class);

	@RequestMapping("")
	public String login(HttpServletRequest request, HttpServletResponse response, Model model){
		try {


		} catch (Exception e) {
			log.info("LoginController login ==> " + e);
		}
		return "login";
	}
}
