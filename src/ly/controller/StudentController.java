package ly.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ly.model.Student;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	private static String message="success";
   private static List<Student> studentList=new ArrayList<Student>();
	
	static{
		studentList.add(new Student(11,1,"张三"));
		studentList.add(new Student(12,2,"李四"));
		studentList.add(new Student(13,3,"王五"));
	}
	
	@RequestMapping("/list")	
	public ModelAndView list(){
		System.out.println("student/list");
		ModelAndView mav=new ModelAndView();
		mav.addObject("studentList",studentList);
		mav.addObject("message", message);
		mav.setViewName("student/list");
		return mav;
		}
	
	@RequestMapping("/preSave")	//映射的名字和链接请求的名字相同(/student/add.do)
	public ModelAndView preSave(@RequestParam(value="id",required=false) String id){//将传递过来的“id”的值赋值给String id;(required=false可以不传递参数)
		ModelAndView mav=new ModelAndView();
		if(null!=id){//修改功能
			mav.addObject("student", studentList.get(Integer.parseInt(id)-1));
			mav.setViewName("student/update");
		}else mav.setViewName("student/add");
		return mav;
	}
	
	@RequestMapping("/save")
	public String save(Student student){//对象自动封装；
		if(student.getId()!=0){//修改
			Student s=studentList.get(student.getId()-1);
			s.setName(student.getName());
			s.setAge(student.getAge());
		}else{//添加
			studentList.add(student);	
			student.setId(studentList.size());
		}
		// return "redirect:/student/list.do";
		return "forward:/student/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id") String id){
		studentList.remove(Integer.parseInt(id)-1);
		return "forward:/student/list.do";
	}
         
}
