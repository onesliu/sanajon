package com.sanajon.dao;

import java.util.List;

import com.sanajon.domain.User;

public interface UserDao {

	public boolean insertUser(User user);
	public boolean deleteUser(User user);
	public boolean updateUser(User user);

	public User getById(int id);
	public User getByName(String name);

	public List<User> getAllUsers();
	public List<User> getByGroup(int groupid);
	public List<User> getByPrivilege(int privilegeid);
	public List<User> getByRole(int roleid);

	public List<User> getByKeyword(String word);
}
