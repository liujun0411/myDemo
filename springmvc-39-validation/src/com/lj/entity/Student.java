package com.lj.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull(message="名字不能为空")
	@Size(min=2,max=6,message="名字必须在2-6个字符之间")
	private String name;
	
	@NotNull(message="分数不能为空")
	@Min(value=0 , message="分数一定大于等于0")
	@Max(value=100,message="分数一定小于等于100")
	private Double score;
	
	@Pattern(regexp="^1[34578]\\d{9}$" , message="电话格式不正确")
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", mobile=" + mobile + "]";
	}
	
	

}
