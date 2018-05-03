package com.lj.di05;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection {
	
	private School[] schools;
	private String[] myStrs;
	private List<String> myList;
	private Set<String> mySet;
	private Map<String,String> myMap;
	private Properties myProp;
	
	public void setSchools(School[] schools) {
		this.schools = schools;
	}
	public void setMyStrs(String[] myStrs) {
		this.myStrs = myStrs;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	public void setMyProp(Properties myProp) {
		this.myProp = myProp;
	}
	@Override
	public String toString() {
		return "Collection [schools=" + Arrays.toString(schools) + ", myStrs=" + Arrays.toString(myStrs) + ", myList="
				+ myList + ", mySet=" + mySet + ", myMap=" + myMap + ", myProp=" + myProp + "]";
	}
	
	
	

}
