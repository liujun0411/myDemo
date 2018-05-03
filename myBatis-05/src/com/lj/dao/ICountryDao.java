package com.lj.dao;

import com.lj.entity.Country;

public interface ICountryDao {
		
	Country SelectCountryByID(int cid);
	
	Country SelectCountryByID2(int cid);

}
