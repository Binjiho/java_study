package org.web.service;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.dao.MemberDao;

public class MemberEmailCheckedService implements MemberService{

	@Override
	public void executeQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServerException, IOException {
		
		MemberDao dao=MemberDao.getInstance();
		
		
	}
	
	
	
}
