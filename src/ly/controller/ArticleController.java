package ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< HEAD
=======
import ly.model.Article;

>>>>>>> 7957b6164c54ad5d8936df476d10bffc3114efeb
@Controller
@RequestMapping("/article")
public class ArticleController {

	@RequestMapping("/list")
	public String list(Model model){
		return "article/list";
	}
<<<<<<< HEAD
=======
	
	@RequestMapping("/details/{id}")
	public ModelAndView details(@PathVariable("id") int id){
		ModelAndView mav=new ModelAndView();
		if(id==1){
			mav.addObject("article", new Article("文章一","文章一的内容"));
		}else if(id==2){
			mav.addObject("article", new Article("文章二","文章二的内容"));
		}
		mav.setViewName("article/details");
		return mav;
	}
>>>>>>> 7957b6164c54ad5d8936df476d10bffc3114efeb
}
