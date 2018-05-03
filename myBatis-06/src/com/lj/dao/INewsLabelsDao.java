package com.lj.dao;

import java.util.List;

import com.lj.entity.NewsLabel;

public interface INewsLabelsDao {
	
	List<NewsLabel> selectChildrenByParent(int pid);
	
	NewsLabel selectNewsLabelById(int id);
	

}
