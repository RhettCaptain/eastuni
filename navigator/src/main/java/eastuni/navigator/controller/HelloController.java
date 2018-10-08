package eastuni.navigator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hellocontroller")
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/starter.html");
		return mv;
	}
	
	@RequestMapping("/body")
	@ResponseBody
	public String body(){
		return "RequestBody";
	}
}
