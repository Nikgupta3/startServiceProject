package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.modelandview.Contact;
import com.modelandview.Login;

public class LoginDAOImpl implements LoginDAO{
private JdbcTemplate jdbcTemplate;
	
	public LoginDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public void addUser(Login login) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO login (username, password, role)"
				+ " VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, login.getUserName(),login.getPassword(),login.getRole());
	}

	@Override
	public List<Login> list() {
		// TODO Auto-generated method stub
		String sql=" SELECT * FROM login";
		List<Login> listContact = jdbcTemplate.query(sql, new RowMapper<Login>() {

			@Override
			public Login mapRow(ResultSet rs, int romNum) throws SQLException {
				// TODO Auto-generated method stub
				Login ulogin =new Login();
				ulogin.setId(rs.getInt("login_id"));
				ulogin.setUserName(rs.getString("username"));
				ulogin.setPassword(rs.getString("password"));
				ulogin.setRole(rs.getString("role"));
				return ulogin;
			}
		
		});

		return listContact;
	}

}
