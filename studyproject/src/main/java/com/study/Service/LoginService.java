package com.study.Service;

import org.springframework.stereotype.Service;

import com.study.model.LoginVO;

@Service
public interface LoginService {
	public void memreg(LoginVO member);
}
