package com.project.college_portal.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public boolean nameValidation(String name) {
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(name);
		return m.matches();
		
	}

	public boolean emailValidation(String email) {
		Pattern p = Pattern.compile("^(.+)@(.+)$");
		Matcher m = p.matcher(email);
		return m.matches();
		
	}

	public boolean phoneNumberValidation(Long phoneNumber) {
		String phone=String.valueOf(phoneNumber);
		Pattern p = Pattern.compile("(0|91)?[6-9]\\d{9}");
		Matcher m = p.matcher(phone);
		return m.matches();
		
	}
	
	public boolean adminEmailValidation(String email) {
		Pattern p = Pattern.compile("^(.+)(hod)@(brightcollege)(.+)$");
		Matcher m = p.matcher(email);
		return m.matches();
		
	}
}