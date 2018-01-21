package cn.njnode.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

	@RequestMapping(value = "{pageUrl}/toPage")
	public String toPage(@PathVariable String pageUrl, HttpServletRequest request){
		return pageUrl.replaceAll("_", "/");
	}
}
