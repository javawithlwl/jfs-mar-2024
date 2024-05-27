package com.careerit.sb;

import com.careerit.sb.jdbc.*;
import com.careerit.sb.jpa.Account;
import com.careerit.sb.jpa.AccountRepository;
import com.careerit.sb.jpa.cbook.domain.Address;
import com.careerit.sb.jpa.cbook.domain.Cart;
import com.careerit.sb.jpa.cbook.domain.Contact;
import com.careerit.sb.jpa.cbook.domain.Item;
import com.careerit.sb.jpa.cbook.repo.AddressRepository;
import com.careerit.sb.jpa.cbook.repo.CartRepository;
import com.careerit.sb.jpa.cbook.repo.ContactRepository;
import com.careerit.sb.jpa.cbook.repo.ItemRepository;
import com.careerit.sb.jpa.cbook.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

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

	@Autowired
	private ContactRepository contactRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private ItemRepository itemRepository;
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





		/*Address address = new Address();
		address.setAddress("Sai Residency");
		address.setCity("Hyderabad");
		address.setState("Telangana");
		address.setCountry("India");
		address.setZipCode("500032");

		Contact contact = new Contact();
		contact.setName("Krish");
		contact.setEmail("krish@gmail.com");
		contact.setMobile("9876543210");
		contact.setAddress(address);
		addContact(contact);*/

		//Contact contact = getContact(UUID.fromString("f155c623-074b-4d3e-9d33-d04ffec96b3d"));

		/*List<Contact> list = contactRepository.findAll();
		list.forEach(contact -> {
			System.out.println(contact.getName());
			System.out.println(contact.getEmail());
			System.out.println(contact.getAddress().getCity());
			System.out.println("-------------------------------------------------");
		});*/

		Item item1 = new Item();
		item1.setName("Laptop");
		item1.setPrice(45000);

		Item item2 = new Item();
		item2.setName("Mobile");
		item2.setPrice(25000);

		Item item3 = new Item();
		item3.setName("Tablet");
		item3.setPrice(15000);

		Cart cart = new Cart();
		cart.setName("Gadgets");
		cartRepository.save(cart);
		item1.setCart(cart);
		item2.setCart(cart);
		item3.setCart(cart);

		Set<Item> items = Set.of(item1, item2, item3);
		itemRepository.saveAll(items);








	}

	@Transactional
	public void addContact(Contact contact) {
		Address address = contact.getAddress();
		addressRepository.save(address);
	  contactRepository.save(contact);
	}

	public Contact getContact(UUID id) {
		return contactRepository.findById(id).orElse(null);
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
