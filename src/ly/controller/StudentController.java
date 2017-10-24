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
	
	private static String message="success";
   private static List<Student> studentList=new ArrayList<Student>();
	
	static{
		studentList.add(new Student(1,11,"张三"));
		studentList.add(new Student(2,12,"李四"));
		studentList.add(new Student(3,13,"王五"));
	}
	@RequestMapping("/list")	
	public ModelAndView list(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("studentList",studentList);
		mav.addObject("message", message);
		mav.setViewName("student/list");
		return mav;
		
	}
         
}
