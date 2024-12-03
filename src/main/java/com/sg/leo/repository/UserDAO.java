package com.sg.leo.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sg.leo.domain.User;

@Repository
public class UserDAO {
	@Autowired
	private SqlSessionTemplate mybaris;
	
	public void insertUser(User user)
	{
		mybaris.insert("insertUser", user);
	}

	public void updateUser(User user)
	{
		mybaris.update("updateUser", user);
	}
	
	public void deleteUser(User user)
	{
		mybaris.delete("deleteUser", user);
	}
	
	public User getuser(User user)
	{
		return mybaris.selectOne("getUser", user);
	}
	
	public List<User> getUserList()
	{
		return mybaris.selectList("getUserList");
	}
}
