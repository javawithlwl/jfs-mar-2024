package com.careerit.bookstore.service;

import com.careerit.bookstore.domain.EmailDetails;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailServiceImpl implements EmailService{

  private final JavaMailSender javaMailSender;
  @Override
  public String sendSimpleMail(EmailDetails details) {

    try {
      SimpleMailMessage message = new SimpleMailMessage();
      message.setTo(details.getRecipient());
      message.setSubject(details.getSubject());
      message.setText(details.getMsgBody());
      javaMailSender.send(message);
      return "Email sent successfully";
    }catch (Exception e){
      log.error("Stack trace: ", e);
      return "Error while sending email";
    }
  }

  @Override
  public String sendMailWithAttachment(EmailDetails details) {
    MimeMessage message = javaMailSender.createMimeMessage();
    MimeMessageHelper helper;
    try {
      helper = new MimeMessageHelper(message, true);
      helper.setTo(details.getRecipient());
      helper.setSubject(details.getSubject());
      helper.setText(details.getMsgBody(), true);
      helper.addAttachment("attachment",
          new File(this.getClass().getResource(details.getAttachment()).getFile()));
      javaMailSender.send(message);
      return "Email sent successfully";
    } catch (Exception e) {
      log.error("Stack trace: ", e);
      return "Error while sending email";
    }
  }
}
