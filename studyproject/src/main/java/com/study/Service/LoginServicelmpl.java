package com.study.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.mapper.LoginMapper;
import com.study.model.LoginVO;

@Service
public class LoginServicelmpl implements LoginService {
	@Autowired
	LoginMapper lm;
	
	public void memreg(LoginVO member) {
		lm.memreg(member);
	}
}