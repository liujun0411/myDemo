package com.lj.dao;

import com.lj.entity.Country;
import com.lj.entity.Students;

public interface ICountryDao {
		
	Country SelectCountryByID(int cid);
	
	Country SelectCountryByID2(int cid);
	
	Country SelectCountryByID3(int cid);
	
	void insertStudent(Students s);

}
