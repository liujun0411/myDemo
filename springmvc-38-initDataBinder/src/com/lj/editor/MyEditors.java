package com.lj.editor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.propertyeditors.PropertiesEditor;

public class MyEditors extends PropertiesEditor {

	@Override
	public void setAsText(String source) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = getSimpleDateFormat(source);
		
		try {
			setValue(sdf.parse(source));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private SimpleDateFormat getSimpleDateFormat(String arg0) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", arg0)) {
			sdf=new SimpleDateFormat("yyyy-MM-dd");
		}else if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", arg0)) {
			sdf=new SimpleDateFormat("yyyy/MM/dd");
		}else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$", arg0)) {
			sdf=new SimpleDateFormat("yyyyMMdd");
		}else {
			throw new TypeMismatchException("", Date.class);
		}
		
		return sdf;
	}
	
}
