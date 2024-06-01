package com.careerit.bookstore.service;

import com.careerit.bookstore.domain.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);

}
