package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

public interface MemberService {
	public abstract void executeQuery() throws IOException, SQLException;
}
