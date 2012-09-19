package com.sanajon.service;

import java.util.List;

import com.sanajon.domain.User;

public interface UserManage {

	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean disableUser(User user);
	public boolean enableUser(User user);
	public boolean modifyUser(User user);

	public User getById(int id);
	public User getByName(String name);

	public List<User> getAllUsers();
	public List<User> getByGroup(int groupid);
	public List<User> getByPrivilege(int privilegeid);
	public List<User> getByRole(int roleid);

	public List<User> getByKeyword(String word);
}
