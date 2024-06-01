package com.careerit.bookstore;

import com.careerit.bookstore.domain.EmailDetails;
import com.careerit.bookstore.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	private EmailService emailService;
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		EmailDetails emailDetails = new EmailDetails();
		emailDetails.setRecipient("krishnakanthkaruchola@gmail.com");
		emailDetails.setSubject("Greeting from Careerit");
		String htmlContent = """
    				<h5 style="color:green">Hello, Welcome to Careerit</h5>
    				<p>Thanks for joining us</p>
    				<br>
    				<br>
    				<p>Regards</p>
    				<p>Careerit Team</p>
				""" ;

		emailDetails.setMsgBody(htmlContent);
		emailDetails.setAttachment("/logo.svg");
		String response = emailService.sendMailWithAttachment(emailDetails);

		System.out.println(response);
	}
}
