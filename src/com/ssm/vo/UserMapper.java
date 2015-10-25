/**
 * 
 */
package com.ssm.vo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * ����ע��� User SQL ���ӳ��
 * 
 * @User ����ΰ
 * 
 * �������ڣ�2015��3��12��
 */
public interface UserMapper {

	/**
	 * ʹ�� @Insert ע��������һ�� INSERT ӳ����䣬�÷��������� INSERT ���ִ�к�Ӱ���������
	 */
	@Insert("insert into tb_user(id, code, name) values(#{id},#{code},#{name})")
	public int insertUser(User User);
	
	/**
	 * ʹ�� @Select ע��������һ�� SELECT ӳ����䣬�÷��������� SELECT ���ִ�к��ѯ���� User ����
	 */
	@Select("select * from tb_user")
	public List<User> findAllUsers();
}
