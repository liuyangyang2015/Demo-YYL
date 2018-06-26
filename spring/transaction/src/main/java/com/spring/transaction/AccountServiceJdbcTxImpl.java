package com.spring.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountServiceJdbcTxImpl implements AccountService {

	@Override
	//@Transactional
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) throws ClassNotFoundException {

		Connection connection = null;
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			System.out.println(connection.toString());
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();
			statement
					.executeUpdate("update account set banlance = banlance -" + amount + "where id = " + sourceAccountId);
			statement
					.executeUpdate("update account set banlance = banlance +" + amount + "where id = " + targetAccountId);
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException ex) {
			}
			throw new RuntimeException(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
			}

		}

	}

}
