package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;
@Component
@Profile("dml")
public class DmlNotificationServiceImpl implements INotificationService {

	@Override
	public void notificate() {
		// TODO Auto-generated method stub
		System.out.println("Only For Dml Profile");
	}

}
