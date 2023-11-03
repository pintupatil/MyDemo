package mvcExample01.Ex01.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping(value = "/welcome")
	public ModelAndView getWelcomePage() {
		String myname="Pintu patil";
		ModelAndView mav=new ModelAndView("Welcome1", "key", myname);
		return mav;
		
	}
}
