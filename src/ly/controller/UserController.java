package ly.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ly.model.User;

@Controller
@RequestMapping("/login")
public class UserController {
	
	@RequestMapping("/user")
	public String login(HttpServletRequest request,HttpServletResponse response){
		System.out.println("----登录验证-------");
		String userName=request.getParameter("userName");
		String passWord=request.getParameter("passWord");
		Cookie cookie=new Cookie("user",userName+passWord);
		//设置Cookie的保存时间
		cookie.setMaxAge(1*60*60*24);//保存一天
		response.addCookie(cookie);//将Cookie放入响应
		User currentUser=new User(userName,passWord);
		HttpSession session=request.getSession();
	   session.setAttribute("currentUser", currentUser);
		return "redirect:/user/main.jsp";
		
		
	}
	
	
}
