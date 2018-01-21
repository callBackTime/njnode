package cn.njnode.controller.backStage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("register")
public class RegisterController {

	private Logger log = Logger.getLogger(RegisterController.class);
	
	
	@RequestMapping("{pageUrl}")
	public String register(@PathVariable String pageUrl
			, HttpServletRequest request, HttpServletResponse response){
		try {

		} catch (Exception e) {
			log.info("RegisterController register ==> " + e);
		}
		return pageUrl.replaceAll("_", "/");
	}
}
