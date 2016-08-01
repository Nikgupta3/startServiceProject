package com.dao;

import java.util.List;


import com.modelandview.Login;

public interface LoginDAO {
	
	public void addUser(Login login);
	
	public List<Login> list();

}
