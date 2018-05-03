package com.lj.entity;

import java.io.Serializable;
import java.util.Set;

public class Country implements Serializable {
	
	private Integer cid;
	private String cname;
	private Set<Minister> ministers;
	
	
	
	public Country() {
		super();
	}

	public Country(Integer cid, String cname, Set<Minister> ministers) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ministers = ministers;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Minister> getMinisters() {
		return ministers;
	}

	public void setMinisters(Set<Minister> ministers) {
		this.ministers = ministers;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", ministers=" + ministers + "]";
	}
	
	

}
