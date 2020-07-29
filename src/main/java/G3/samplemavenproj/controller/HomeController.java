package G3.samplemavenproj.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping(value="/customer")
public class HomeController {
	//http://localhost:8096/samplemavenproj/customer
	@RequestMapping(value="/")
	public ModelAndView test() throws IOException{
		return new ModelAndView("customerhome");
	}
	
	//http://localhost:8096/samplemavenproj/customer/details
	@RequestMapping(value="/details")
	public ModelAndView welcome() throws IOException{
		ModelAndView modelAndView=null;
		try {
			modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("name", "Ramu");
			modelAndView.addObject("id", "C001");
			modelAndView.addObject("phone", "1234567890");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return modelAndView;
	}
}
