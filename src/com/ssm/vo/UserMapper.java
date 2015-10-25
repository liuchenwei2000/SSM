/**
 * 
 */
package com.ssm.vo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * 基于注解的 User SQL 语句映射
 * 
 * @User 刘晨伟
 * 
 * 创建日期：2015年3月12日
 */
public interface UserMapper {

	/**
	 * 使用 @Insert 注解来定义一个 INSERT 映射语句，该方法将返回 INSERT 语句执行后影响的行数。
	 */
	@Insert("insert into tb_user(id, code, name) values(#{id},#{code},#{name})")
	public int insertUser(User User);
	
	/**
	 * 使用 @Select 注解来定义一个 SELECT 映射语句，该方法将返回 SELECT 语句执行后查询到的 User 对象。
	 */
	@Select("select * from tb_user")
	public List<User> findAllUsers();
}
