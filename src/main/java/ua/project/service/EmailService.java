package ua.project.service;

import ua.project.domain.mail.Mail;

public interface EmailService {

	void sendMessage(Mail mail);
	
}
