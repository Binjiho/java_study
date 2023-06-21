package org.project.service;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberInsertService implements MemberService{

	@Override
	public void executeQuerySerivce(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {	
		System.out.println("회원가입");
		
		
		
	}
	
}
