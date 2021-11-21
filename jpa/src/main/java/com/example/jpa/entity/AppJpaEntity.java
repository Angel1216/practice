package com.example.jpa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "user_jpa")
public class AppJpaEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "userId")
	private Integer userId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "ADDITION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date additionDate;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public java.util.Date getAdditionDate() {
		return additionDate;
	}

	public void setAdditionDate(java.util.Date additionDate) {
		this.additionDate = additionDate;
	}
	
	

	
	
}
