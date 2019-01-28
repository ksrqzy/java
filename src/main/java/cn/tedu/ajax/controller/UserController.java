package cn.tedu.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.ajax.util.ResponseResult;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/handle_login.do")
	@ResponseBody
	public ResponseResult<Void> handleLogin(
			String username, String password) {
		ResponseResult<Void> rr
			= new ResponseResult<Void>();
		if ("root".equals(username)) {
			if ("1234".equals(password)) {
				// 登录成功
				rr.setState(1);
				rr.setMessage("登录成功");
			} else {
				// 密码错
				rr.setState(2);
				rr.setMessage("密码错");
			}
		} else {
			// 用户名错
			rr.setState(3);
			rr.setMessage("用户名错");
		}
		return rr;
	}

}








