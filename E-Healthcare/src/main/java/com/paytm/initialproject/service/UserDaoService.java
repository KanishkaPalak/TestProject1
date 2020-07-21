package com.paytm.initialproject.service;

import org.springframework.stereotype.Service;
import com.paytm.initialproject.dao.UserDaoImplement;

@Service
public class UserDaoService {

	private static UserDaoImplement userdao;
	public static void getAllDoctors()
	{
		userdao.showAllDoctors();
	}
}
