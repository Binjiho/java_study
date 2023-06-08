package org.java.collection;

import java.io.IOException;
import java.sql.SQLException;

public class MemberInsert implements MemberService{
	@Override
	public void executeQueryService() throws SQLException, IOException {
		System.out.println("회원가입");
		
	}
	
	public MemberDto generateObject(Long id, String userId, String userPw) {
		MemberDto result = new MemberDto(id,userId,userPw);
		return result;
	}

}
