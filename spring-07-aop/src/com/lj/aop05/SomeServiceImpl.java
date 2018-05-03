package com.lj.aop05;


public class SomeServiceImpl implements ISomeService {


	@Override
	public boolean login(String userName ,String password) throws UserException {
		// TODO Auto-generated method stub
		if(!"beijing".equals(userName)) {
			throw new UserNameException("用户名输入错误");
		}
		if(!"111".equals(password)) {
			throw new PasswordException("密码输错错误");
		}
//		double d = 3/0;
		return true;
	}

}
