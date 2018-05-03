package com.lj.entity;

public class NewsLabel {
	private Integer id;
	private String name;
	private NewsLabel parent;
	
	public NewsLabel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public NewsLabel(Integer id, String name, NewsLabel parent) {
		super();
		this.id = id;
		this.name = name;
		this.parent = parent;
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



	public NewsLabel getParent() {
		return parent;
	}



	public void setParent(NewsLabel parent) {
		this.parent = parent;
	}



	@Override
	public String toString() {
		return "NewsLabel [id=" + id + ", name=" + name + ", parent=" + parent + "]";
	}






	
	
}
