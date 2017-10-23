package ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	public class HWController {

		@RequestMapping("/helloWorld")
		public String helloWorld(Model model){
			model.addAttribute("message", "HelloWorld");
			return "helloWorld";
		}
	}

