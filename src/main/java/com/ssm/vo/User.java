/**
 * 
 */
package com.ssm.vo;

/**
 * 
 * <p>
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年10月24日
 */
public class User {

	private String id;
	private String code;
	private String name;

	public User() {
		super();
	}

	public User(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
