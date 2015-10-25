/**
 * 
 */
package com.ssh.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.ssh.util.IDGenerator;
import com.ssh.vo.User;
import com.ssh.vo.UserMapper;

/**
 * 
 * <p>
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年10月24日
 */
@Repository
public class UserDAOImpl implements IUserDAO {

	@Resource
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public String getUserName() {
		StringBuilder sb = new StringBuilder();
		SqlSession sqlSession = getSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		try {
			List<User> users = mapper.findAllUsers();

			for (User user : users) {
				sb.append(user.getName());
				sb.append("<p>");
			}
		} finally {
			sqlSession.close();
		}
		return sb.toString();
	}

	@Override
	public String addUser(User user) {
		if (user == null) {
			throw new IllegalArgumentException("User cannot be null.");
		}
		
		SqlSession sqlSession = getSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		String id = IDGenerator.gen36();
		user.setId(id);
		try {
			mapper.insertUser(user);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return "id:" + id;
	}

	private SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
}
