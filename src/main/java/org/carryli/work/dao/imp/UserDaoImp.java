package org.carryli.work.dao.imp;

import org.carryli.work.entity.User;

public interface UserDaoImp {
	public User selectUser(User user);
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUserById(int userId);
}
