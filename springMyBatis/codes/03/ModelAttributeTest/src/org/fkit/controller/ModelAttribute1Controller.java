package org.fkit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
//@SessionAttributes("loginname") //当使用了该注解后，userModel1方法仅被调用一次，每次直接进入login1地调用？
public class ModelAttribute1Controller{

	// 使用@ModelAttribute注释的value属性，来指定model属性的名称,model属性对象就是方法的返回值
	@ModelAttribute("loginname")
	public String userModel1( 
			@RequestParam("loginname") String loginname){
		System.out.println("loginname:" + loginname);
		return loginname;
	}

	@RequestMapping(value="/login1")
	 public String login1() {
		 return "result1";
	 }

}

