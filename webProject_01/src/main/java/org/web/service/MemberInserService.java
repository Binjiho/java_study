package org.web.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberInserService implements MemberService{
	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException{
		// TODO Auto-generated method stub
		System.out.println("회원가입");
	}
}
