package cn.njnode.controller.backStage;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("perm")
public class PermController {

	@RequestMapping(value = "addResource", method = { GET, POST })
	public String addResource(HttpServletRequest request, Model model) {
		try {
			
		} catch (Exception e) {
			
		}
		return null;
	}
	@RequestMapping(value = "resourceList", method = { GET, POST })
	public String resourceList(HttpServletRequest request, Model model) {
		try {
			
		} catch (Exception e) {
			
		}
		return null;
	}
}
