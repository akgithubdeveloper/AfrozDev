package org.app.service.impl;

import org.app.service.INotificationService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dml")
public class DmlNotificationServiceImpl implements INotificationService {

	@Override
	public void notificate() {
		System.out.println("Only for DML profile");
	}

}
