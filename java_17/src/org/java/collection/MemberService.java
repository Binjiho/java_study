package org.java.collection;

import java.io.IOException;
import java.sql.SQLException;

public interface MemberService {
	public abstract void executeQueryService()
			throws SQLException, IOException;
}
