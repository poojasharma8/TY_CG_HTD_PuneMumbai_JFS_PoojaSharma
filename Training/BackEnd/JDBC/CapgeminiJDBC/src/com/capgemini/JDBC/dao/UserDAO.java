package com.capgemini.JDBC.dao;

import java.util.List;

import com.capgemini.JDBC.bean.UserBean;

public interface UserDAO {
	
	public List<UserBean> getAllInfo();
	public UserBean getInfo(int userid);
	public UserBean userlogin(int userid,String password);	
	
}
