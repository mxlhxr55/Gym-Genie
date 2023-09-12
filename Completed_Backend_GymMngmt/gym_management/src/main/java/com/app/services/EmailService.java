package com.app.services;
//package com.sunbeam.services;
//
//import java.util.concurrent.Executor;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Service;
//
//@Service
//
//public class EmailService {
//	@Autowired
//    private JavaMailSender mailSender;
//
//@Autowired
//private Executor taskExecutor;
//
//
//public void sendEmailAsync(String to, String subject, String body) {
//    try {
//            SimpleMailMessage message = new SimpleMailMessage();
//            message.setFrom("malharp535@gmail.com");
//            message.setTo(to);
//            message.setSubject(subject);
//            message.setText(body);
//
//            mailSender.send(message);
//
//            // Log success
//            System.out.println("Email sent successfully to: " + to);
//        } catch (Exception e) {
//            // Log error
//            System.err.println("Error sending email: " + e.getMessage());
//        }
//    
//}
//}





