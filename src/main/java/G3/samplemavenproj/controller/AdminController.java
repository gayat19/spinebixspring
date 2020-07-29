package G3.samplemavenproj.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/admin")
public class AdminController {

	//http://localhost:8096/samplemavenproj/admin
	@RequestMapping(value="/")
	public ModelAndView home() throws IOException{
		return new ModelAndView("adminhome");
	}
	
	@RequestMapping(value="/city/{name}")
	public ModelAndView showCity(@PathVariable("name") String cname) throws IOException{
		ModelAndView modelAndView = new ModelAndView("showcity");
		modelAndView.addObject("city", cname);
		return modelAndView;
	}
	
	
	//http://localhost:8096/samplemavenproj/admin/add
	@RequestMapping(value="/add")
	public ModelAndView create() throws IOException{
		return new ModelAndView("admincreate");
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView adminLogin(@RequestParam("un") String username,@RequestParam("pass") String password) throws IOException{
		ModelAndView modelAndView = new ModelAndView("adminshow");
		if(password.equals("1234"))
		{
			//modelAndView = new ModelAndView("adminshow");
			modelAndView.addObject("message", "Welcome "+username);

		}		
		else
		{
			//modelAndView = new ModelAndView("admincreate");
			modelAndView.addObject("message", "Invalid username or password");
		}
		return modelAndView;
	}
}
