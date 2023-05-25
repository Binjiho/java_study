package org.java.controller;

import org.java.service.MemberService;

public class MemberController {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		ms.excuteQuery();
		
	}
}
