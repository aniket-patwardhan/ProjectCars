package com.example.demo.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity(name = "memberInfo")
@Table(name = "member_info")
public class MemberInfo {

	
	@Id
	@JsonProperty("authKey")
	@Column(name = "auth_key")
	private String authKey;
	
	@JsonProperty("memberID")
	@Column(name = "member_id", length = 50)
	private String memberId;

	@JsonProperty("FirstName")
	@Column(name = "first_name", length = 100)
	private String firstName;

	@JsonProperty("LastName")
	@Column(name = "last_name", length = 100)
	private String lastName;
	
	@JsonProperty("dOB")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "PST")
	@Column(name = "dob")
	private Date dob;

	@JsonProperty("sex")
	@Column(name = "sex")
	private String sex;

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
