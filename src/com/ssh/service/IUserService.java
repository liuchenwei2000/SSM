/**
 * 
 */
package com.ssh.service;

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
public interface IUserService {

	public String queryUserName();
	
	public String addNewUser(User user);
}
