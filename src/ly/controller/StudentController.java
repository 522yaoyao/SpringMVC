package ly.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ly.model.Student;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	private static List<Student> studentList=new ArrayList<Student>();
	
	static{
		studentList.add(new Student(1,20,"张三"));
		studentList.add(new Student(2,20,"李四"));
	}
	
@RequestMapping("/list")	
	public ModelAndView list(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("studentList",studentList);
		mav.setViewName("student/list");
		return mav;
		
	}
         
}
