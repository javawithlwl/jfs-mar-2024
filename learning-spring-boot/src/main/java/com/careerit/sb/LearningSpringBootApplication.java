package com.careerit.sb;

import com.careerit.sb.jdbc.*;
import com.careerit.sb.jpa.Account;
import com.careerit.sb.jpa.AccountRepository;
import com.careerit.sb.jpa.cbook.domain.Contact;
import com.careerit.sb.jpa.cbook.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LearningSpringBootApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private PlayerDao playerDao;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private ContactService contactService;
	public static void main(String[] args) {
    SpringApplication.run(LearningSpringBootApplication.class, args);
  }



	@Override
	public void run(String... args) throws Exception {
	/*	//employeeDao.createTable();
		*//*long id = employeeDao.addEmployee("Suresh", 55000);
		System.out.println("Employee id : "+id);*//*

//		employeeDao.updateEmployee(3, 5000);

		Employee employee = employeeDao.getEmployeeById(3);

		System.out.println(employee);

		List<Player> players = playerDao.getPlayers("CSK", "Batsman", 1000000);
		players.forEach(System.out::println);

		List<TeamAmountStats> teamAmountStats = playerDao.getTeamAmountStats();
		teamAmountStats.forEach(System.out::println);*/

		//accountRepository.saveAll(accountList());

		/*List<Account> list = accountRepository.selectAccountBalanceGt(10000);
		list.forEach(account-> {
			System.out.println("Account number: " + account.getAccno());
			System.out.println("Name: " + account.getName());
			System.out.println("Balance: " + account.getBalance());
			System.out.println("-------------------------------------------------");
		});*/

		Contact contact = new Contact();
		contact.setName("Krish");
		contact.setEmail("krish@gmail.com");
		contact.setMobile("9876543210");
		contact.setCity("Hyderabad");

		contactService.createContact(contact);


	}



	private List<Account> accountList() {
		List<Account> list = new ArrayList<>();
		Account account1 = new Account();
		account1.setAccno("SB1001");
		account1.setName("Krish");
		account1.setBalance(10000);

		Account account2 = new Account();
		account2.setAccno("SB1002");
		account2.setName("Manoj");
		account2.setBalance(20000);

		Account account3 = new Account();
		account3.setAccno("SB1003");
		account3.setName("Charan");
		account3.setBalance(30000);

		list.add(account1);
		list.add(account2);
		list.add(account3);

		return list;
	}

}
