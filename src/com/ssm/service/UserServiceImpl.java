/**
 * 
 */
package com.ssm.service;

import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import com.ssm.dao.IUserDAO;
import com.ssm.vo.User;

/**
 * 
 * <p>
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2015��10��24��
 */
@Service
@Transactional 
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDAO userDao;

	@Override
	public String queryUserName() {
		return userDao.getUserName();
	}

	@Override
	public String addNewUser(User user) {
		return userDao.addUser(user);
	}
}
