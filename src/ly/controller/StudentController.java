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
		studentList.add(new Student(11,1,"����"));
		studentList.add(new Student(12,2,"����"));
		studentList.add(new Student(13,3,"����"));
	}
	
	@RequestMapping("/list")	
	public ModelAndView list(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("studentList",studentList);
		mav.addObject("message", message);
		mav.setViewName("student/list");
		return mav;
		}
	
	@RequestMapping("/preSave")	//ӳ������ֺ����������������ͬ(/student/add.do)
	public ModelAndView preSave(@RequestParam(value="id",required=false) String id){//�����ݹ����ġ�id����ֵ��ֵ��String id;(required=false���Բ����ݲ���)
		ModelAndView mav=new ModelAndView();
		if(null!=id){//�޸Ĺ���
			mav.addObject("student", studentList.get(Integer.parseInt(id)-1));
			mav.setViewName("student/update");
		}else mav.setViewName("student/add");
		return mav;
	}
	
	@RequestMapping("/save")
	public String save(Student student){//�����Զ���װ��
		if(student.getId()!=0){//�޸�
			Student s=studentList.get(student.getId()-1);
			s.setName(student.getName());
			s.setAge(student.getAge());
		}else{//���
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
