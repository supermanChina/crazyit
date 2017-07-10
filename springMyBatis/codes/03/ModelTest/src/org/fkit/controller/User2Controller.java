package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;




/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
public class User2Controller{
	private static final Log logger = LogFactory.getLog(User2Controller.class);
	
	//默认情况下，通过String参数名称与页面表单中的name属性同名映射传参
	@ModelAttribute
	public void userMode2(String loginname2,String password2,
			 ModelMap modelMap){
		logger.info("userMode2");
		// 创建User对象存储jsp页面传入的参数
		User user = new User();
		user.setLoginname(loginname2);
		user.setPassword(password2);
		// 将User对象添加到ModelMap当中
		modelMap.addAttribute("user", user);
	}
	
	@RequestMapping(value="/login2")
	 public String login2(ModelMap modelMap){
		logger.info("login2");
		// 从ModelMap当中取出之前存入的名为user的对象
		User user = (User) modelMap.get("user");
		System.out.println(user);
		// 设置user对象的username属性
		user.setUsername("测试2");
		return "result2";
	}
	
	

}

