package com.lj.entity;

import java.util.Set;

public class NewsLabel {
	private Integer id;
	private String name;
	private Set<NewsLabel> childrenLabel;
	
	public NewsLabel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public NewsLabel(Integer id, String name, Set<NewsLabel> childrenLabel) {
		super();
		this.id = id;
		this.name = name;
		this.childrenLabel = childrenLabel;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<NewsLabel> getChildrenLabel() {
		return childrenLabel;
	}
	public void setChildrenLabel(Set<NewsLabel> childrenLabel) {
		this.childrenLabel = childrenLabel;
	}



	@Override
	public String toString() {
		return "NewsLabel [id=" + id + ", name=" + name + ", ChildrenLabel=" + childrenLabel + "]";
	}
	
	
	
	
}
