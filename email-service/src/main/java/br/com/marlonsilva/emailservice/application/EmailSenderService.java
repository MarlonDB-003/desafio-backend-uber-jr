package br.com.marlonsilva.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.marlonsilva.emailservice.adapters.EmailSenderGateway;
import br.com.marlonsilva.emailservice.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase{

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void emailSend(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
    
}
