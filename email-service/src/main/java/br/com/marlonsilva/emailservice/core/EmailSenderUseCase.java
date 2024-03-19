package br.com.marlonsilva.emailservice.core;

public interface EmailSenderUseCase {

    void emailSend(String to, String subject, String body);
    
}
