package org.carryli.work.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.carryli.work.dao.imp.UserDaoImp;
import org.carryli.work.entity.User;
import org.carryli.work.service.impl.UserService;

 
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDaoImp userDao;


	public UserDaoImp getUserDao() {
		return userDao;
	}
	@Autowired
	public void setUserDao(UserDaoImp userDao) {
		this.userDao = userDao;
	}

	@Override
	public void delete(User user) {

	}

	@Override
	public void update(User user) {

	}

	@Override
	public boolean checkLogin(User user) {
		User result = userDao.selectUser(user);
		return result.getUsername() == user.getUsername();
	}

	@Override
	public void add(User user) {

	}

	@Override
	public List<User> findAll() {
		return null;
	}
	@Override
	public boolean exist(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
