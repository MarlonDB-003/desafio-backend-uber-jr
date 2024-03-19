package br.com.marlonsilva.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
    
}
