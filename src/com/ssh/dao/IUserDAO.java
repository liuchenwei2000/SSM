/**
 * 
 */
package com.ssh.dao;

import com.ssh.vo.User;

/**
 * 
 * <p>
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2015��10��24��
 */
public interface IUserDAO {

	public String getUserName();
	
	public String addUser(User user);
}
