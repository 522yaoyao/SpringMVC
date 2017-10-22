package ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HWController {

	@RequestMapping("/helloWorld")
	public String HelloWord(Model model){
		
    	model.addAttribute("message", "Helloworld");
		return "helloWorld";
	}
}
